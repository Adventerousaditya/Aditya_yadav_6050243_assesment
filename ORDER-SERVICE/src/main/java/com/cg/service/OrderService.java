package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import com.cg.dto.*;
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    private static long orderCounter = 5000;

    @CircuitBreaker(name = "orderService", fallbackMethod = "fallbackOrder")
    public OrderResponse createOrder(Long userId, Long productId, int quantity) {

        User user = restTemplate.getForObject(
                "http://localhost:8081/users/" + userId,
                User.class);

        Product product = restTemplate.getForObject(
                "http://localhost:8082/products/" + productId,
                Product.class);

        double totalPrice = product.getPrice() * quantity;

        return new OrderResponse(
                ++orderCounter,
                user.getName(),
                product.getName(),
                quantity,
                totalPrice
        );
    }

    public OrderResponse fallbackOrder(Long userId, Long productId, int quantity, Exception ex) {

        return new OrderResponse(
                0L,
                "Service Unavailable",
                "Service Unavailable",
                quantity,
                0.0
        );
    }
}