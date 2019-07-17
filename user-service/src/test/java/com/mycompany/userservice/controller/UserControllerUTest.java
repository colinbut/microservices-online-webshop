/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.controller;

import com.mycompany.userservice.model.User;
import com.mycompany.userservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerUTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void testGetUsers() {
        List<User> users = new ArrayList<>();
        users.add(getTestUser());

        Mockito.when(userService.getUsers()).thenReturn(users);

        ResponseEntity responseEntity = userController.getUsers();

        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        List<User> actualUserList = (List<User>) responseEntity.getBody();

        assertTrue(actualUserList.size() == 1);

        User user = actualUserList.get(0);

        assertEquals("Test User Firstname", user.getFirstname());
        assertEquals("Test User Lastname", user.getLastname());
        assertEquals("Test User Username", user.getUsername());
        assertEquals("Test User email address", user.getEmailAddress());
        assertEquals("Test User password", user.getPassword());

    }

    @Test
    public void testGetUser() {

        int userId = 1;

        Mockito.when(userService.getUser(userId)).thenReturn(getTestUser());

        ResponseEntity responseEntity = userController.getUser(userId);

        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        User user = (User) responseEntity.getBody();

        assertEquals("Test User Firstname", user.getFirstname());
        assertEquals("Test User Lastname", user.getLastname());
        assertEquals("Test User Username", user.getUsername());
        assertEquals("Test User email address", user.getEmailAddress());
        assertEquals("Test User password", user.getPassword());
    }

    @Test
    public void testAddNewUser() {

    }

    @Test
    public void testDeleteExistingUser() {

    }

    private User getTestUser() {
        User user = new User();
        user.setFirstname("Test User Firstname");
        user.setLastname("Test User Lastname");
        user.setUsername("Test User Username");
        user.setEmailAddress("Test User email address");
        user.setPassword("Test User password");
        return user;
    }
}
