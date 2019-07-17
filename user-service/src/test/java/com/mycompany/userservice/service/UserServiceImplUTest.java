/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.service;

import com.mycompany.userservice.dao.UserDao;
import com.mycompany.userservice.model.User;
import com.mycompany.userservice.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplUTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserService userService = new UserServiceImpl();

    @Test
    public void whenGetUsers_thenReturnListOfUsers() {

        List<User> userList = new ArrayList<>();

        Mockito.when(userDao.findUsers()).thenReturn(userList);

        List<User> actualUserList = userService.getUsers();

        assertFalse(actualUserList.isEmpty());

        Mockito.verify(userDao, Mockito.atMost(1)).findUsers();
    }

    @Test
    public void givenUserId_whenGetUser_thenUserWithThatUserId() {
        int userId = 1;
        User expectedUser = new User();

        Mockito.when(userDao.findUser(userId)).thenReturn(expectedUser);

        User actualUser = userService.getUser(userId);

        assertEquals(expectedUser.getFirstname(), actualUser.getFirstname());
        assertEquals(expectedUser.getLastname(), actualUser.getLastname());
        assertEquals(expectedUser.getEmailAddress(), actualUser.getEmailAddress());
        assertEquals(expectedUser.getUsername(), actualUser.getUsername());
        assertEquals(expectedUser.getPassword(), actualUser.getPassword());

        Mockito.verify(userDao, Mockito.atMost(1)).findUser(userId);
    }

    @Test
    public void givenNewUser_whenAddUser_thenAddNewUser() {
        User newUser = new User();

        Mockito.doNothing().when(userDao).saveUser(newUser);

        userService.addUser(newUser);

        Mockito.verify(userDao, Mockito.atMost(1)).saveUser(newUser);
    }

    @Test
    public void givenExistingUser_whenUpdateUser_thenUpdateExistingUser() {

    }

    @Test
    public void givenExistingUser_whenRemoveUser_thenRemoveExistingUser() {
        int userId = 1;

        Mockito.doNothing().when(userDao).deleteUser(userId);

        userService.removeUser(userId);

        Mockito.verify(userDao, Mockito.atMost(1)).deleteUser(userId);
    }

}
