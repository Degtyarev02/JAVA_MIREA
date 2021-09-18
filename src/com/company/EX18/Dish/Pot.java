package com.company.EX18.Dish;

import com.company.EX18.Dish.Dish;

public class Pot extends Dish {
    public Pot(String material, int price, String color) {
        super(material, price, color);
    }

    public void washDish() {
        System.out.println("Кастрюля отмыта");
    }

    @Override
    public String toString() {
        return "Pot: " + super.toString();
    }
}
