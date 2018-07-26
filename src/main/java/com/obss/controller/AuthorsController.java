package com.obss.controller;

import com.obss.model.Authors;
import com.obss.model.BookInfo;
import com.obss.service.AuthorService;
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
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    private AuthorService authorService;


    @GetMapping("/{authorId}")
    public Authors getAuthors(@PathVariable int authorId ){

        return authorService.find(authorId);
    }

    @PostMapping
    public Authors saveAuthors(@RequestBody Authors author){

        return authorService.addAuthors(author);

    }

    @PutMapping("/{authorId}")
    public Authors updateAuthors(@PathVariable int authorId, @RequestBody Authors author){

        return authorService.editAuthors(author,authorId);

    }

    @DeleteMapping("/{authorId}")
    public void deleteAuthors(@PathVariable int authorId){

        authorService.deleteAuthors(authorId);

    }

    @GetMapping
    public List<Authors> getAllAuthors(){

        return authorService.findAll();
    }

}
