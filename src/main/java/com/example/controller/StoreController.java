package com.example.controller;

import com.example.model.Oder;
import com.example.model.Store;
import com.example.service.OderService;
import com.example.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    StoresService storesService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(storesService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addStore(@RequestBody Store store) {
        storesService.save(store);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(storesService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Store store) {
        store.setId(id);
        storesService.save(store);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        storesService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    }

