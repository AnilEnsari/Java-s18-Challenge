package com.example.challenge.service;


import com.example.challenge.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book find(int id);
    Book save(Book book);
    Book put (int id , Book book);
    Book delete (int id);
}
