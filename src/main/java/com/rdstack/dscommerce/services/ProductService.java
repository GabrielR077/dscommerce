package com.rdstack.dscommerce.services;

import com.rdstack.dscommerce.dto.ProductDTO;
import com.rdstack.dscommerce.entities.Product;
import com.rdstack.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO productDTO = new ProductDTO(product);
        return productDTO;
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> result = repository.findAll();
        return result.stream().map(x -> new ProductDTO(x)).toList();
    }
}
