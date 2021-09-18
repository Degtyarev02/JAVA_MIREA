package com.company.EX19;

import com.company.EX19.Nameable.Nameable;
import com.company.EX19.Priceable.Car;
import com.company.EX19.Priceable.Priceable;
import com.company.EX19.Priceable.Smartphone;

public class test {
    public static void main(String[] args) {
        Priceable car = new Car(20000, "Audi");
        Priceable car2 = new Car(100000, "Bmw");
        Priceable smartphone = new Smartphone("IPhone", 1250);

        System.out.println(car.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(smartphone.getPrice());

        Nameable car3 = (Nameable)car;
        Nameable phone = (Nameable)smartphone;

        System.out.println(car3.getName());
        System.out.println(phone.getName());
    }
}
