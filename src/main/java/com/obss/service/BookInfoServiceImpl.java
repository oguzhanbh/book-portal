package com.obss.service;



import com.obss.dao.BookInfoDao;
import com.obss.dao.UsersDao;
import com.obss.model.BookInfo;
import com.obss.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookInfoService")
public class BookInfoServiceImpl implements BookInfoService {


    @Autowired
    @Qualifier("bookInfoDao")
    private BookInfoDao bookInfoDao;


    public BookInfo addBookInfo(BookInfo bookInfo) {
        bookInfoDao.addBookInfo(bookInfo);
        return bookInfo;

    }

    public BookInfo editBookInfo(BookInfo bookInfo, int bookID) {
        bookInfoDao.editBookInfo(bookInfo,bookID);
        return bookInfo;
    }

    public void deleteBookInfo(int bookID) {
        bookInfoDao.deleteBookInfo(bookID);
    }

    public BookInfo find(int bookID) {
        return bookInfoDao.find(bookID);
    }

    public List < BookInfo > findAll() {
        return bookInfoDao.findAll();
    }
}
