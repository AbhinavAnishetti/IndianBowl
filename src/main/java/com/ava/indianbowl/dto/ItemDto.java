package com.ava.indianbowl.dto;

import com.ava.indianbowl.resource.Item;

public class ItemDto {

    private static final long serialVersionUID = 4865903039190151223L;

    private long itemId;
    private long productId;
    private long fillingId;
    private int  fillingCount;
    private int  itemCount;
    private long cartId;
    private double totalPrice;

    public ItemDto(Item item) {
        this.productId = item.getProductId();
        this.fillingId = item.getFillingId();
        this.cartId    = item.getCartId();
        this.fillingCount = item.getFillingCount();
        this.itemCount   = item.getItemCount();
        this.totalPrice  = item.getTotalPrice();
    }

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
