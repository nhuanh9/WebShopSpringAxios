package com.example.controller;

import com.example.model.Oder;
import com.example.model.OderDetail;
import com.example.model.Product;
import com.example.service.OderDetailService;
import com.example.service.OderService;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/odrerdetails")
public class OderDetailController {

    @Autowired
    OderDetailService oderDetailService;

    @Autowired
    ProductService productService;

    @Autowired
    OderService oderService;

    @GetMapping
    public ResponseEntity findAll() {
        return new ResponseEntity(oderDetailService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addOderDetail(@RequestBody OderDetail oderDetail) {
        oderDetailService.save(oderDetail);
        Product product = productService.findById(oderDetail.getProduct().getId()).get();
        Oder oder = oderService.findById(oderDetail.getOder().getId()).get();
        if (oder.getStore().getId() == 1) {
            product.setInventoryQuantity(product.getInventoryQuantity() - oderDetail.getAmount());
            product.setAmount(product.getAmount() + oderDetail.getAmount());
        } else if (oder.getStore().getId() == 2) {
            product.setInventoryQuantity1(product.getInventoryQuantity1() - oderDetail.getAmount());
            product.setAmount1(product.getAmount1() + oderDetail.getAmount());
        } else {
            product.setInventoryQuantity2(product.getInventoryQuantity2() - oderDetail.getAmount());
            product.setAmount2(product.getAmount2() + oderDetail.getAmount());
        }
        productService.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(oderDetailService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody OderDetail oderDetail) {
        oderDetail.setId(id);
        oderDetailService.save(oderDetail);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        oderDetailService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/findAllByOderId")
    public ResponseEntity findAllByOrderId(Long id) {
        return new ResponseEntity(oderDetailService.findAllByOrderId(id), HttpStatus.OK);
    }


}

