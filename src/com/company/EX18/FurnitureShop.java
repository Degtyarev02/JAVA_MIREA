package com.company.EX18;

public class FurnitureShop {

    public static int cashBox = 0;

    public static void buyFurniture(Furniture item) {
        cashBox += item.getPrice();
        System.out.println(item.getTitle() + " продан, в кассе " + cashBox);
    }

    public static void additionalServices(Furniture item) {
        cashBox += 20;
        item.assembleFurniture();
        System.out.println("Выручка " + cashBox);
    }


    public static void main(String[] args) {
        Furniture chair = new Chair("INGOLF", "Wood", 20 );
        Furniture chair2 = new Chair("GUNDE", "Plastic", 30 );
        Furniture table = new Table("LINNMON", "Wood", 60 );
        Furniture chandeliar = new Chandelier("RAMSELE", "Bamboo", 100 );

        buyFurniture(chair);
        additionalServices(chair);
        buyFurniture(chair2);
        additionalServices(chair2);
        buyFurniture(table);
        additionalServices(table);
        buyFurniture(chandeliar);
        additionalServices(chandeliar);
    }
}
