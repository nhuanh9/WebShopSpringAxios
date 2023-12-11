package com.example.service.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }


    public Iterable<Product> findAllByNameContaining(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    public Iterable<Product> findAllByPriceBetween(Double price, Double price1) {
        return productRepository.findAllByPriceBetween(price , price1);
    }

    public Iterable<Product> findAllByInventoryQuantityDesc(){
        return productRepository.findAllByOrderByInventoryQuantityDesc();
    };

    public Iterable<Product> findAllByOrderByAmountDesc(){
        return productRepository.findAllByOrderByAmountDesc();
    };
}
