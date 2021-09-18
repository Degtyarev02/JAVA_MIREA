package com.company.EX18.Furniture;

import com.company.EX18.Furniture.Furniture;

public class Table extends Furniture {
    public Table(String title, String material, Integer price) {
        super(title, material, price);
    }

    @Override
    public void assembleFurniture() {
        System.out.println("Стол " + this.getTitle() + " собран");
    }

    public void foldTable(){
        System.out.println("Стол разложен");
    }

    public void spreadTable(){
        System.out.println("Стол сложен");
    }

}
