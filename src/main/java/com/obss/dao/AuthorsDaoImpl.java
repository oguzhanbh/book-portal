package com.obss.dao;

import com.obss.model.Authors;
import com.obss.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("authorsDao")
public class AuthorsDaoImpl implements AuthorsDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addAuthors(Authors author) {
        jdbcTemplate.update("INSERT INTO authors (authorID, name, surname) VALUES (?, ?, ?)",
                author.getAuthorID(), author.getAuthorName(), author.getAuthorSurname());
        System.out.println("Author Added!!");
    }

    public void editAuthors(Authors author, int authorId) {
        jdbcTemplate.update("UPDATE authors SET name = ? , surname = ? WHERE authorID = ? ",
                author.getAuthorName(), author.getAuthorSurname(), authorId);
        System.out.println("Author Updated!!");
    }

    public void deleteAuthors(int authorId) {
        jdbcTemplate.update("DELETE from authors WHERE authorID = ? ", authorId);
        System.out.println("Author Deleted!!");
    }

    public Authors find(int authorId) {
        Authors author = (Authors) jdbcTemplate.queryForObject("SELECT * FROM authors where authorID = ? ",
                new Object[] { authorId }, new BeanPropertyRowMapper(Authors.class));
        System.out.println(author.getAuthorName() + " " + author.getAuthorSurname());
        return author;

    }

    public List < Authors > findAll() {
        List < Authors > authorsList = jdbcTemplate.query("SELECT * FROM authors", new BeanPropertyRowMapper(Authors.class));
        return authorsList;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
