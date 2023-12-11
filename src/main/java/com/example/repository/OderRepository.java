package com.example.repository;


import com.example.model.Oder;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface OderRepository extends JpaRepository<Oder, Long> {

    Iterable<Oder> findAllByCreatedAtBetween(Date starOfMonth, Date endOfMonth);
    Iterable<Oder> findAllByOrderByIdDesc();
}
