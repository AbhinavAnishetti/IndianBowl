package com.ava.indianbowl.resource;

public class Item {
    private long productId;
    private long fillingId;
    private int  fillingCount;
    private int  itemCount;
    private long cartId;
    private double totalPrice;

    public Item(Builder builder){
        this.cartId = builder.cartId;
        this.fillingCount = builder.fillingCount;
        this.fillingId = builder.fillingId;
        this.itemCount = builder.itemCount;
        this.productId = builder.productId;
        this.totalPrice = builder.totalPrice;
    }

    public long getProductId() {
        return productId;
    }

    public long getFillingId() {
        return fillingId;
    }

    public int getFillingCount() {
        return fillingCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public long getCartId() {
        return cartId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", productId=" + productId +
                ", fillingId=" + fillingId +
                ", fillingCount=" + fillingCount +
                ", itemCount=" + itemCount +
                ", cartId=" + cartId +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder{
       private long productId;
       private long fillingId;
       private int  fillingCount;
       private int  itemCount;
       private long cartId;
       private double totalPrice;

       public Builder(long fillingId, long productId, double totalPrice){
           productId = productId;
           fillingId = fillingId;
           totalPrice = totalPrice;
       }

       public Builder setFillingCount(int fillingCount){
           this.fillingCount = fillingCount;
           return this;
       }

       public Builder setItemCount(int itemCount){
           this.itemCount = itemCount;
           return this;
       }

       public Builder setCartId(long cartId){
           this.cartId = cartId;
           return this;
       }

       public Item Build(){
           return new Item(this);
       }

    }
}
