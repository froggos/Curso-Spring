package com.example.benjamin.spring.di.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.benjamin.spring.di.springboot_di.models.Product;
import com.example.benjamin.spring.di.springboot_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${config.price.tax}")
    private Double tax;

    private ProductRepository repo;

    public ProductServiceImpl(@Qualifier("productJson") ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> findAll() {
        return repo.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * tax;
            Product newProd = (Product) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return repo.findById(id);
    }
}
