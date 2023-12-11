package com.example.service.impl;

import com.example.model.OderDetail;
import com.example.repository.OderDetailRepository;
import com.example.service.OderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OderDetailServiceImpl implements OderDetailService {

    @Autowired
    OderDetailRepository oderDetailRepository;

    @Override
    public void save(OderDetail oderDetail) {
        oderDetailRepository.save(oderDetail);
    }

    @Override
    public Iterable<OderDetail> findAll() {
        return oderDetailRepository.findAll();
    }

    @Override
    public Optional<OderDetail> findById(Long id) {
        return oderDetailRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
       oderDetailRepository.deleteById(id);
    }

    public Iterable<OderDetail>findAllByOrderId(Long id){
        return oderDetailRepository.findAllByOderId(id);
    };
}
