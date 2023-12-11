package com.example.service.impl;

import com.example.model.Oder;
import com.example.repository.OderRepository;
import com.example.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class OderServiceImpl implements OderService {

    @Autowired
    OderRepository oderRepository;

    @Override
    public void save(Oder oder) {
        oderRepository.save(oder);
    }

    @Override
    public Iterable<Oder> findAll() {
        return oderRepository.findAll();
    }

    @Override
    public Optional<Oder> findById(Long id) {
        return oderRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        oderRepository.deleteById(id);
    }

   public Iterable<Oder> findAllByCreatedAtBetween(Date starOfMonth, Date endOfMonth){
        return oderRepository.findAllByCreatedAtBetween(starOfMonth, endOfMonth);
   }

    @Override
    public Iterable<Oder> findAllByOrderById() {
        return oderRepository.findAllByOrderByIdDesc();
    }


}
