package com.example.controller;

import com.example.model.Sales;
import com.example.model.Store;
import com.example.service.SalesService;
import com.example.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(salesService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addSales(@RequestBody Sales sales) {
        salesService.save(sales);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(salesService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Sales sales) {
        sales.setId(id);
        salesService.save(sales);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        salesService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    }

