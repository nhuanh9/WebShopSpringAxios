package com.example.service;

import com.example.model.Oder;

import java.util.Date;

public interface OderService extends IService<Oder>{

    Iterable<Oder> findAllByCreatedAtBetween(Date starOfMonth, Date endOfMonth);
    Iterable<Oder> findAllByOrderById();
}
