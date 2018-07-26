package com.obss.dao;


import com.obss.model.BookInfo;

import java.util.List;

public interface BookInfoDao {


    public void addBookInfo(BookInfo bookInfo);

    public void editBookInfo(BookInfo bookInfo, int bookID);

    public void deleteBookInfo(int bookID);

    public BookInfo find(int bookID);

    public List<BookInfo> findAll();
}


