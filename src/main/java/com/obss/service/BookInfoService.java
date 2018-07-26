package com.obss.service;

import com.obss.model.Authors;
import com.obss.model.BookInfo;

import java.util.List;

public interface BookInfoService {


    public BookInfo addBookInfo(BookInfo bookInfo);

    public BookInfo editBookInfo(BookInfo bookInfo, int bookID);

    public void deleteBookInfo(int bookID);

    public BookInfo find(int bookID);

    public List< BookInfo > findAll();
}
