package com.example.controller;

import com.example.model.Category;
import com.example.model.Comments;
import com.example.service.CategoryService;
import com.example.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    CommentsService service;

    @GetMapping
    public ResponseEntity findAll() {
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addSales(@RequestBody Comments comments) {
        service.save(comments);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Comments comments) {
        comments.setId(id);
        service.save(comments);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}

