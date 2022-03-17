package com.example.apptest.repository;

import com.example.apptest.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    public Product findByName(String name); }
