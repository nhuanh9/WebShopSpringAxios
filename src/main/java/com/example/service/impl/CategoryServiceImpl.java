package com.example.service.impl;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repository;

    @Override
    public void save(Category supplier) {
        repository.save(supplier);
    }

    @Override
    public Iterable<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


}
