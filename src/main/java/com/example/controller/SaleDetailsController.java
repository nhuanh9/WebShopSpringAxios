package com.example.controller;

import com.example.model.SaleDetails;
import com.example.model.Sales;
import com.example.service.SaleDetailsService;
import com.example.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/saleDetails")
public class SaleDetailsController {

    @Autowired
    SaleDetailsService saleDetailsService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(saleDetailsService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addSales(@RequestBody SaleDetails saleDetails) {
        saleDetailsService.save(saleDetails);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(saleDetailsService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody SaleDetails saleDetails) {
        saleDetails.setId(id);
        saleDetailsService.save(saleDetails);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        saleDetailsService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    }

