package com.obss.dao;

import com.obss.model.Users;

import java.util.List;

public interface UsersDao {

    //Methods update,insert,delete to be declared.

    public void addUsers(Users user);

    public void editUsers(Users user, int userId);

    public void deleteUsers(int UserId);

    public Users find(int UserId);

    public List< Users > findAll();

}
