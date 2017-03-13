/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.service;

import com.mycompany.userservice.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(int userId);

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int userId);
}
