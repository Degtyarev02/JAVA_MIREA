package com.company.EX19;

public class test {
    public static void main(String[] args) {
        Priceable car = new Car(20000, "Audi");
        Priceable car2 = new Car(100000, "Bmw");
        Priceable smartphone = new Smartphone("IPhone", 1250);

        System.out.println(car.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(smartphone.getPrice());
    }
}
