package com.example.service;

import com.example.model.Product;


public interface ProductService extends IService<Product> {

    public Iterable<Product> findAllByPriceBetween(Double price, Double price1);

    public Iterable<Product> findAllByNameContaining(String name);
    Iterable<Product> findAllByInventoryQuantityDesc();

    Iterable<Product> findAllByOrderByAmountDesc();
}
