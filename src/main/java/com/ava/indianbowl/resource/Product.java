package com.ava.indianbowl.resource;

public class Product {
    private long productId;
    private String productName;
    private double basePrice;

    public Product(long productId, String productName, double basePrice) {
        this.productId = productId;
        this.productName = productName;
        this.basePrice = basePrice;
    }

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
