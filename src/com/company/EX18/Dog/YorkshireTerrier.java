package com.company.EX18.Dog;

public class YorkshireTerrier extends Dog{
    public YorkshireTerrier(int age) {
        super("Yorkshire terrier", age);
    }

    @Override
    public void bark() {
        System.out.println("Yip-yip");
    }

    @Override
    public void eat() {
        System.out.println("Eats special food");
    }
}
