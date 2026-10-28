package com.rdstack.dscommerce.controllers;

import com.rdstack.dscommerce.dto.ProductDTO;
import com.rdstack.dscommerce.entities.Product;
import com.rdstack.dscommerce.repositories.ProductRepository;
import com.rdstack.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){

        return service.findById(id);
    }

    @GetMapping
    public List<ProductDTO> findAll(){
        return service.findAll();
    }
}
