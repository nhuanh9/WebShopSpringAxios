package com.example.service;

import com.example.model.Blog;

public interface IBlogService extends IService<Blog> {
    Iterable<Blog> findAllByContentContaining(String content);

    Iterable<Blog> findAllByDayCreate(String day);

    Iterable<Blog> findAllByUserId(Long id);

    Iterable<Blog> findAllByStatusPublic();
}
