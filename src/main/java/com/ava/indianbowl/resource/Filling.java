package com.ava.indianbowl.resource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filling {
    private String name;
    private double price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long fillingId;

    public Filling(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getFillingId() {
        return fillingId;
    }

    public void setFillingId(long fillingId) {
        this.fillingId = fillingId;
    }
}
