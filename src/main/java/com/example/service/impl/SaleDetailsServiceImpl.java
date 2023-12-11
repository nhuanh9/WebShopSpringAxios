package com.example.service.impl;

import com.example.model.SaleDetails;
import com.example.repository.SaleDetailsRepository;
import com.example.service.SaleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleDetailsServiceImpl implements SaleDetailsService {

    @Autowired
    SaleDetailsRepository saleDetailsRepository;

    @Override
    public void save(SaleDetails saleDetails) {
        saleDetailsRepository.save(saleDetails);
    }

    @Override
    public Iterable<SaleDetails> findAll() {
        return saleDetailsRepository.findAll();
    }

    @Override
    public Optional<SaleDetails> findById(Long id) {
        return saleDetailsRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        saleDetailsRepository.deleteById(id);
    }


}
