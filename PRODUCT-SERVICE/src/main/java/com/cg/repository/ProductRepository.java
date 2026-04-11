package com.cg.repository;

import java.util.*;
import org.springframework.stereotype.Repository;
import com.cg.entity.Product;

@Repository
public class ProductRepository {

    private Map<Long, Product> products = new HashMap<>();

    public ProductRepository() {
        products.put(101L, new Product(101L, "Keyboard", 1200));
    }

    public Product findById(Long id) {
        return products.get(id);
    }
}