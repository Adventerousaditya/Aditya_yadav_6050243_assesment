package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.dto.OrderRequest;
import com.cg.dto.OrderResponse;
import com.cg.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {

        return service.createOrder(
                request.getUserId(),
                request.getProductId(),
                request.getQuantity()
        );
    }
}