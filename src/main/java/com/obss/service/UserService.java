package com.obss.service;

import com.obss.model.Users;

import java.util.List;

public interface UserService {

    public Users addUsers(Users user);

    public Users editUsers(Users user, int userId);

    public void deleteUsers(int userId);

    public Users find(int userId);

    public List< Users > findAll();


}
