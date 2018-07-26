package com.obss.controller;

import com.obss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.obss.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.obss.service.UserService;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
@ResponseBody
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userID}")
    public Users getUser(@PathVariable int userID ){

        return userService.find(userID);
    }

    @PostMapping
    public Users saveUser(@RequestBody Users user){
        //Save user.
        return userService.addUsers(user);

    }

    @PutMapping("/{userId}")
    public Users updateUser(@PathVariable int userId, @RequestBody Users user){
        //Update user.
        return userService.editUsers(user,userId);

    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){

        userService.deleteUsers(userId);
        //Delete user.
    }

    @GetMapping
    public List<Users> getAllUser(){

        return userService.findAll();
    }

}
