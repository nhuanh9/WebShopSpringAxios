package com.example.service.impl;

import com.example.model.Sales;
import com.example.repository.SalesRepository;
import com.example.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    SalesRepository salesRepository;

    @Override
    public void save(Sales sales) {
        salesRepository.save(sales);
    }

    @Override
    public Iterable<Sales> findAll() {
        return salesRepository.findAll();
    }

    @Override
    public Optional<Sales> findById(Long id) {
        return salesRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        salesRepository.deleteById(id);
    }


}
