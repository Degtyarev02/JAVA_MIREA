package com.company.EX18;

public class Chair extends Furniture{
    public Chair(String title, String material, Integer price) {
        super(title, material, price);
    }

    @Override
    public void assembleFurniture() {
        System.out.println("Стул " + this.getTitle() + " собран");
    }


}
