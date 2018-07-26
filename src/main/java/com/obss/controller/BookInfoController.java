package com.obss.controller;

import com.obss.model.Authors;
import com.obss.model.BookInfo;
import com.obss.service.AuthorService;
import com.obss.service.BookInfoService;
import com.obss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
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
@RequestMapping("/bookInfo")
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;


    @GetMapping("/{bookID}")
    public BookInfo getBookInfo(@PathVariable int bookID ){

        return bookInfoService.find(bookID);
    }

    @PostMapping
    public BookInfo saveBookInfo(@RequestBody BookInfo bookInfo){

        return bookInfoService.addBookInfo(bookInfo);

    }

    @PutMapping("/{bookID}")
    public BookInfo updateBookInfo(@PathVariable int bookID, @RequestBody BookInfo bookInfo){

        return bookInfoService.editBookInfo(bookInfo,bookID);

    }

    @DeleteMapping("/{bookID}")
    public void deleteBookInfo(@PathVariable int bookID){

        bookInfoService.deleteBookInfo(bookID);

    }

    @GetMapping
    public List<BookInfo> getAllBookInfo(){

        return bookInfoService.findAll();
    }

}
