package com.obss.service;



import com.obss.dao.UsersDao;
import com.obss.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("usersDao")
    private UsersDao userDao;


    public Users addUsers(Users user) {
        userDao.addUsers(user);
        return user;

    }

    public Users editUsers(Users user, int userId) {
       userDao.editUsers(user,userId);
       return user;
    }

    public void deleteUsers(int userId) {
        userDao.deleteUsers(userId);
    }

    public Users find(int userId) {
        return userDao.find(userId);
    }

    public List < Users > findAll() {
        return userDao.findAll();
    }
}
