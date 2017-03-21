/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.userservice.dao.impl;

import com.mycompany.userservice.dao.UserDao;
import com.mycompany.userservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger LOG = LoggerFactory.getLogger(UserDaoImpl.class);

    private static final String FIND_ALL_USERS_SQL = "SELECT * FROM USERS";
    private static final String FIND_USER_SQL = "SELECT * FROM USERS WHERE id = ?";
    private static final String UPDATE_USER_SQL = "UPDATE USER SET firstname = ?, lastname = ?, username = ?, " +
        "password = ?, email = ? where id = ?";
    private static final String DELETE_USER_SQL = "DELETE FROM USER WHERE id = ?";

    private UserRowMapper userRowMapper = new UserRowMapper();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findUsers() {
        List<User> users = jdbcTemplate.query(FIND_ALL_USERS_SQL, userRowMapper);

        LOG.info("Retrieved list of users from database: {}", users);

        return users;
    }

    @Override
    public User findUser(int userId) {

        User user = jdbcTemplate.queryForObject(
            FIND_USER_SQL, new Object[] {userId}, userRowMapper
        );

        LOG.info("Retrieved user with id {} from database: {}", userId, user);

        return user;
    }

    @Override
    public void saveUser(User user) {
        LOG.info("Updating user in database with id {}:", user.getId());

        int updateCount = jdbcTemplate.update(UPDATE_USER_SQL,
            user.getFirstname(), user.getLastname(), user.getUsername(), user.getPassword(), user.getEmailAddress(),
            user.getId());

        if (updateCount == 1) {
            LOG.info("Successfully updated database for user with id {}: ", user.getId());
        }

    }

    @Override
    public void deleteUser(int userId) {
        LOG.info("Deleting user in database with id {}:", userId);

        int deleteCount = jdbcTemplate.update(DELETE_USER_SQL, userId);

        if (deleteCount == 1) {
            LOG.info("Successfully deleted user with id: {} from database", userId);
        }
    }

    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return mapUser(rs);
        }

        private User mapUser(ResultSet rs) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setFirstname(rs.getString("firstname"));
            user.setLastname(rs.getString("lastname"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmailAddress(rs.getString("email"));
            return user;
        }
    }
}
