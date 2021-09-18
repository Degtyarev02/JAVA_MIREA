package com.company.EX19.Priceable;

import com.company.EX19.Nameable.Nameable;

public class Smartphone implements Priceable, Nameable {
    private String model;
    private int price;

    public Smartphone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.model;
    }
}
