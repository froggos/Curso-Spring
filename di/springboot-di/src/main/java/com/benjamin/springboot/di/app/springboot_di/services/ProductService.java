package com.benjamin.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.benjamin.springboot.di.app.springboot_di.models.Product;
import com.benjamin.springboot.di.app.springboot_di.repositories.ProductRepository;

public class ProductService implements IProductService {
    private ProductRepository repo = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return repo.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.25d;
            // Product newProduct = new Product(p.getId(), p.getName(),
            // priceImp.longValue());
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return repo.findById(id);
    }
}
