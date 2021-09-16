package com.company.EX18;

public class Chandelier extends Furniture {
    public Chandelier(String title, String material, Integer price) {
        super(title, material, price);
    }

    @Override
    public void assembleFurniture() {
        System.out.println("Лампу " + this.getTitle() + " подвесили");
    }

    public void lightOn() {
        System.out.println("Light on!");
    }

    public void lightOff() {
        System.out.println("Light off!");
    }
}
