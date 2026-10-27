package com.rdstack.dscommerce.controllers;

import com.rdstack.dscommerce.entities.Product;
import com.rdstack.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public String test(){
        Optional<Product> result = repository.findById(2L);
        Product product = result.get();
        return product.getName();
    }
}
