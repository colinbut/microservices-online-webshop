/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.service.impl;

import com.mycompany.userservice.dao.UserDao;
import com.mycompany.userservice.model.User;
import com.mycompany.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findUsers();
    }

    @Override
    public User getUser(int userId) {
        return userDao.findUser(userId);
    }

    @Override
    public void addUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void removeUser(int userId) {
        userDao.deleteUser(userId);
    }
}
