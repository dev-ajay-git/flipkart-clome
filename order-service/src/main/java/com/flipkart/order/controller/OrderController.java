package com.flipkart.order.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public List<String> getAllOrders() {
        return Arrays.asList("Order-1", "Order-2", "Order-3");
    }

    @PostMapping
    public String placeOrder(@RequestBody String order) {
        return "Order placed: " + order;
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable int id) {
        return "Order with ID: " + id;
    }
}
