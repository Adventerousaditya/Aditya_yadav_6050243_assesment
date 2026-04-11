package com.cg.dto;

public class OrderRequest {

    private Long userId;
    private Long productId;
    private int quantity;

    public OrderRequest() {}

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}