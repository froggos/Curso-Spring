package com.benjamin.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.benjamin.springboot.di.app.springboot_di.models.Product;

public class ProductRepository implements IProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 3000L),
                new Product(2L, "CPU Intel Core i9", 83000L),
                new Product(3L, "Teclado Razer Mini", 4000L),
                new Product(4L, "Placa madre Gigabyte", 70000L));
    }

    @Override
    public List<Product> findAll() {
        return this.data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
