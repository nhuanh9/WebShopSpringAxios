package com.example.controller;

import com.example.model.Inventory;
import com.example.model.Sales;
import com.example.service.InventoryService;
import com.example.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/inventorys")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(inventoryService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addSales(@RequestBody Inventory inventory) {
        inventoryService.save(inventory);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(inventoryService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Inventory inventory) {
        inventory.setId(id);
        inventoryService.save(inventory);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        inventoryService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    }

