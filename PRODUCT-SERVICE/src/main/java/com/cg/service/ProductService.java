package com.cg.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cg.entity.Product;

@Service
public class ProductService {

    private Map<Long, Product> products = new HashMap<>();

    public ProductService() {
        products.put(101L, new Product(101L, "Keyboard", 1200));
        products.put(102L, new Product(102L, "Mouse", 500));
    }

    public Product getProductById(Long id) {
        Product product = products.get(id);

        if (product == null) {
            throw new RuntimeException("Product not found with id: " + id);
        }

        return product;
    }
}