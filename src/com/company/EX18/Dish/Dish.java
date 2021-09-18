package com.company.EX18.Dish;

public abstract class Dish {
    private String material;
    private int price;
    private String color;

    public Dish(String material, int price, String color) {
        this.material = material;
        this.price = price;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void washDish();

    @Override
    public String toString() {
        return "material = " + material +
                ", price = " + price +
                ", color = " + color;
    }
}
