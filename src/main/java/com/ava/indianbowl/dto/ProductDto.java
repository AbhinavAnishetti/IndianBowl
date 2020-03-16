package com.ava.indianbowl.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
    private static final long serialVersionUID = 4865903039190150223L;
    private long productId;
    private String productName;
    private double basePrice;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
