/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.dao;

import com.mycompany.userservice.model.User;

import java.util.List;

public interface UserDao {

    List<User> findUsers();

    User findUser(int userId);

    void saveUser(User user);

    void deleteUser(int userId);

}
