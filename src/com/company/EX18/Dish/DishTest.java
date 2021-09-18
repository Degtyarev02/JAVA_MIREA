package com.company.EX18.Dish;

public class DishTest {
    public static void main(String[] args) {
        Dish plate = new Plate("Ceramic", 20, "white");
        Dish pot = new Pot("Steel", 40, "Grey");
        plate.washDish();
        pot.washDish();
        System.out.println(plate);
        System.out.println(pot);
    }
}
