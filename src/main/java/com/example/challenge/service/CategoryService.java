package com.example.challenge.service;

import com.example.challenge.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category find(int id);
    Category save(Category category);
    Category put (int id , Category category);
    Category delete (int id);
}
