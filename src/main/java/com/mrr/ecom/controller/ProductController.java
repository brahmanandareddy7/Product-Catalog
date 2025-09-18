package com.mrr.ecom.controller;

import com.mrr.ecom.dto.ProductRequest;
import com.mrr.ecom.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService service){
        this.productService=service;
    }

    @GetMapping(value = "/v1/greet",produces = MediaType.APPLICATION_JSON_VALUE)
    private String getgreeting(){
        return "Hello";
    }

    @PostMapping(value = "/v1/")
    private ResponseEntity<String> addProduct(@RequestBody  @Valid ProductRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(request));
    }

}
