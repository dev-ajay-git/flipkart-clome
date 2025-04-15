package com.flipkart.product.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return Arrays.asList("Laptop", "Phone", "Headphones");
    }

    @PostMapping
    public String addProduct(@RequestBody String product) {
        return "Product added: " + product;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        return "Product with ID: " + id;
    }
}
