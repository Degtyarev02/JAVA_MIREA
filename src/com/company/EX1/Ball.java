package com.company.EX1;

public class Ball {
    private String model;
    private Integer price;

    public Ball(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball: " + model + " Price:" + price;
    }

    public void kickTheBall() {
        System.out.println("You kick the ball " + model);
    }
}
