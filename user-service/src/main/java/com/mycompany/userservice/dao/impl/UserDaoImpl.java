/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.dao.impl;

import com.mycompany.userservice.dao.UserDao;
import com.mycompany.userservice.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public List<User> findUsers() {
        return users;
    }

    @Override
    public User findUser(int userId) {
        return users.get(userId);
    }

    @Override
    public void saveUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(int userId) {
        users.remove(userId);
    }
}
