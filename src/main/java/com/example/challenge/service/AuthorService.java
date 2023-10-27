package com.example.challenge.service;

import com.example.challenge.entity.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();
    Author find(int id);
    Author save(Author author);
    Author put (int id , Author author);
    Author delete (int id);
}
