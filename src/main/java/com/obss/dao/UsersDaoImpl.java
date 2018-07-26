package com.obss.dao;

import com.obss.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.obss.model.Users;

@Repository
@Qualifier("usersDao")
public class UsersDaoImpl implements UsersDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addUsers(Users user) {
        jdbcTemplate.update("INSERT INTO user (userID,  roleID, username, email, password) VALUES (?, ?, ?, ?, ?)",
                user.getUserID(), user.getRoleID(), user.getUserName(), user.getMail(),user.getPassword());
        System.out.println("User Added!!");
    }

    public void editUsers(Users user, int userId) {
        jdbcTemplate.update("UPDATE user SET roleID = ? , username = ? , email = ? , password = ? WHERE userID = ? ",
                user.getRoleID(), user.getUserName(), user.getMail(),user.getPassword(), userId);
        System.out.println("User Updated!!");
    }

    public void deleteUsers(int userId) {
        jdbcTemplate.update("DELETE from user WHERE userID = ? ", userId);
        System.out.println("User Deleted!!");
    }

    public Users find(int userId) {
        Users user = (Users) jdbcTemplate.queryForObject("SELECT * FROM user where userID = ? ",
                new Object[] { userId }, new BeanPropertyRowMapper(Users.class));

        return user;
    }

    public List < Users > findAll() {
        List < Users > usersList = jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper(Users.class));
        return usersList;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
