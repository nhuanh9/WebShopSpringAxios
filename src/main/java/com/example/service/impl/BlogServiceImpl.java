package com.example.service.impl;

import com.example.model.Blog;
import com.example.repository.BlogRepository;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }



    @Override
    public Iterable<Blog> findAllByContentContaining(String content) {
        return blogRepository.findAllByContentContaining(content);
    }

    @Override
    public Iterable<Blog> findAllByDayCreate(String day) {
        return blogRepository.findAllByDayCreate(day);
    }

    @Override
    public Iterable<Blog> findAllByUserId(Long id) {
        return blogRepository.findAllByUserId(id);
    }

    @Override
    public Iterable<Blog> findAllByStatusPublic() {
        return blogRepository.findAllByStatusPublic();
    }


}
