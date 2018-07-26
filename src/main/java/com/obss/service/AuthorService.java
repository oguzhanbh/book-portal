package com.obss.service;

import com.obss.model.Authors;

import java.util.List;

public interface AuthorService {



    public Authors addAuthors(Authors author);

    public Authors editAuthors(Authors author, int authorId);

    public void deleteAuthors(int authorId);

    public Authors find(int authorId);

    public List< Authors > findAll();
}
