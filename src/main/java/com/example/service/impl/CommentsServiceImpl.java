package com.example.service.impl;

import com.example.model.Category;
import com.example.model.Comments;
import com.example.repository.CategoryRepository;
import com.example.repository.CommentsRepository;
import com.example.service.CategoryService;
import com.example.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsRepository repository;

    @Override
    public void save(Comments supplier) {
        repository.save(supplier);
    }

    @Override
    public Iterable<Comments> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Comments> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


}
