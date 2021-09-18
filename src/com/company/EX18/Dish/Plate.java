package com.company.EX18.Dish;

import com.company.EX18.Dish.Dish;

public class Plate extends Dish {

    public Plate(String material, int price, String color) {
        super(material, price, color);
    }

    public void washDish() {
        System.out.println("Тарелка помыта");
    }

    @Override
    public String toString() {
        return "Plate: " + super.toString();
    }
}
