package com.obss.service;



import com.obss.dao.AuthorsDao;
import com.obss.dao.UsersDao;
import com.obss.model.Authors;
import com.obss.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AuthorService")
public class AuthorServiceImpl implements AuthorService {


    @Autowired
    @Qualifier("authorsDao")
    private AuthorsDao authorsDao;


    public Authors addAuthors(Authors author) {
        authorsDao.addAuthors(author);
        return author;

    }

    public Authors editAuthors(Authors author, int authorId) {
        authorsDao.editAuthors(author,authorId);
        return author;
    }

    public void deleteAuthors(int authorId) {
        authorsDao.deleteAuthors(authorId);
    }

    public Authors find(int authorId) {
        return authorsDao.find(authorId);
    }

    public List < Authors > findAll() {
        return authorsDao.findAll();
    }
}
