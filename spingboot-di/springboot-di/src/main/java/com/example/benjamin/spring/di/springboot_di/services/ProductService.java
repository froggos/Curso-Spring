package com.example.benjamin.spring.di.springboot_di.services;

import java.util.List;

import com.example.benjamin.spring.di.springboot_di.models.Product;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);
}
