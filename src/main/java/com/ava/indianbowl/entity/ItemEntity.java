package com.ava.indianbowl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="item")
public class ItemEntity {

    private static final long serialVersionUID = 5313493418359884403L;

    @Id
    @GeneratedValue
    private long itemId;

    @Column(nullable = false)
    private long productId;

    @Column(nullable = false)
    private long fillingId;

    @Column(nullable = false)
    private int  fillingCount;

    @Column(nullable = false)
    private int  itemCount;

    @Column(nullable = false)
    private long cartId;

    @Column(nullable = false)
    private double totalPrice;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getFillingId() {
        return fillingId;
    }

    public void setFillingId(long fillingId) {
        this.fillingId = fillingId;
    }

    public int getFillingCount() {
        return fillingCount;
    }

    public void setFillingCount(int fillingCount) {
        this.fillingCount = fillingCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
