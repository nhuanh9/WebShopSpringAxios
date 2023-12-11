package com.example.controller;

import com.example.model.Oder;
import com.example.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@Controller
@CrossOrigin("*")
@RequestMapping("/oders")
public class OderController {

    @Autowired
    OderService oderService;

    @GetMapping
        public ResponseEntity findAll() {
            return new ResponseEntity(oderService.findAll(), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity addOder(@RequestBody Oder oder) {
        oder.setCreatedAt(java.time.LocalDate.now());
        oderService.save(oder);
        return new ResponseEntity(oderService.findAllByOrderById(),HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(oderService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Oder oder) {
        oder.setId(id);
        oderService.save(oder);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        oderService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/findByCreatedAtBetween")
    public ResponseEntity findAllByCreatedAtBetween(Date starOfMonth, Date endOfMonth){
        return new ResponseEntity(oderService.findAllByCreatedAtBetween(starOfMonth, endOfMonth), HttpStatus.OK);
    }




    }

