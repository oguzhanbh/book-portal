package com.obss.dao;

import com.obss.model.Authors;
import com.obss.model.BookInfo;
import com.obss.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("bookInfoDao")
public class BookInfoDaoImpl implements BookInfoDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addBookInfo(BookInfo bookInfo) {
        jdbcTemplate.update("INSERT INTO bookinfo (bookID, title, publishDate, updateDate, insertDate, insertedBy) VALUES (?, ?, ?, ?, ?, ?)",
                bookInfo.getBookID(), bookInfo.getTitle(), bookInfo.getPublishDate(), bookInfo.getUpdateDate(), bookInfo.getInsertDate(), bookInfo.getInsertedBy());
        System.out.println("BookInfo Added!!");
    }

    public void editBookInfo(BookInfo bookInfo, int bookID) {
        jdbcTemplate.update("UPDATE bookinfo SET  title = ?, publishDate = ?, updateDate = ?, insertDate = ?, insertedBy = ? WHERE bookID = ? ",
                bookInfo.getTitle(), bookInfo.getPublishDate(), bookInfo.getUpdateDate(), bookInfo.getInsertDate(), bookInfo.getInsertedBy(), bookID);
        System.out.println("BookInfo Updated!!");
    }

    public void deleteBookInfo(int bookID) {
        jdbcTemplate.update("DELETE from bookinfo WHERE bookID = ? ", bookID);
        System.out.println("BookInfo Deleted!!");
    }

    public BookInfo find(int bookID) {
        BookInfo bookInfo = (BookInfo) jdbcTemplate.queryForObject("SELECT * FROM bookinfo where bookID = ? ",
                new Object[] { bookID }, new BeanPropertyRowMapper(BookInfo.class));
        System.out.println(bookInfo.getTitle());
        return bookInfo;

    }

    public List < BookInfo > findAll() {
        List < BookInfo > bookInfoList = jdbcTemplate.query("SELECT * FROM bookinfo", new BeanPropertyRowMapper(BookInfo.class));
        return bookInfoList;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
