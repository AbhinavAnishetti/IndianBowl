package com.ava.indianbowl.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name="product")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 5313493418359894403L;

    @Id
    @GeneratedValue
    private long productId;

    @Column(nullable = false, length = 50)
    private String productName;

    @Column(nullable = false)
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
