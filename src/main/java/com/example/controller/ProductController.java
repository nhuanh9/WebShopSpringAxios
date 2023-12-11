package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity findAll() {
        return new ResponseEntity(productService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(productService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        productService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/findByName")
    public ResponseEntity findAllByNameContaining(@RequestParam String name) {
        return new ResponseEntity(productService.findAllByNameContaining(name), HttpStatus.OK);
    }



    @GetMapping("/findByPriceBetween")
    public ResponseEntity findAllByPriceBetween(@RequestParam Double from,@RequestParam Double to) {
        return new ResponseEntity(productService.findAllByPriceBetween(from, to), HttpStatus.OK);
    }

    @GetMapping("/findByInventoryQuantity")
    public ResponseEntity findAllByInventoryQuantityDesc(){
        return new ResponseEntity(productService.findAllByInventoryQuantityDesc(), HttpStatus.OK);
    }

    @GetMapping("/findByAmount")
    public ResponseEntity findAllByOrderByAmountDesc(){
        return new ResponseEntity(productService.findAllByOrderByAmountDesc(), HttpStatus.OK);
    }
}



