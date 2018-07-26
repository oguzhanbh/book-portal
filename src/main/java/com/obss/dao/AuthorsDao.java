package com.obss.dao;

import com.obss.model.Authors;
import com.obss.model.Users;

import java.util.List;

public interface AuthorsDao {



    public void addAuthors(Authors author);

    public void editAuthors(Authors author, int authorId);

    public void deleteAuthors(int authorId);

    public Authors find(int authorId);

    public List<Authors> findAll();
}
