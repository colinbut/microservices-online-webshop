/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(int userId);

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int userId);
}
