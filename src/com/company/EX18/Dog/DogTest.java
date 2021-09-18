package com.company.EX18.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog bigDog = new Sheepdog(5);
        Dog smallDog = new YorkshireTerrier(2);

        System.out.println(bigDog);
        System.out.println(smallDog);

        bigDog.bark();
        smallDog.bark();

        bigDog.eat();
        smallDog.eat();
    }

}
