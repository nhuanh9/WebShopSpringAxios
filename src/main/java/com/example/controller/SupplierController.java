package com.example.controller;

import com.example.model.Sales;
import com.example.model.Supplier;
import com.example.service.SalesService;
import com.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(supplierService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addSales(@RequestBody Supplier supplier) {
        supplierService.save(supplier);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(supplierService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Supplier supplier) {
        supplier.setId(id);
        supplierService.save(supplier);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        supplierService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    }

