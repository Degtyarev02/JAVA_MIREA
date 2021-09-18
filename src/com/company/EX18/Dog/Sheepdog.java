package com.company.EX18.Dog;

public class Sheepdog extends Dog{

    public Sheepdog(int age) {
        super("Sheepdog", age);
    }

    @Override
    public void bark() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
