package com.example.service.impl;

import com.example.model.Inventory;
import com.example.model.Store;
import com.example.repository.InventoryRepository;
import com.example.repository.StoreRepository;
import com.example.service.InventoryService;
import com.example.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public void save(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    @Override
    public Iterable<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    @Override
    public Optional<Inventory> findById(Long id) {
        return inventoryRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        inventoryRepository.deleteById(id);
    }


}
