package com.example.service.impl;

import com.example.model.Store;
import com.example.repository.StoreRepository;
import com.example.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoresServiceImpl implements StoresService {

    @Autowired
    StoreRepository storeRepository;

    @Override
    public void save(Store store) {
        storeRepository.save(store);
    }

    @Override
    public Iterable<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        storeRepository.deleteById(id);
    }


}
