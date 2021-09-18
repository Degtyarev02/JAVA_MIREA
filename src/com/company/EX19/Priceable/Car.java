package com.company.EX19.Priceable;

import com.company.EX19.Nameable.Nameable;

public class Car implements Priceable, Nameable {
    private int price;
    private String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
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
