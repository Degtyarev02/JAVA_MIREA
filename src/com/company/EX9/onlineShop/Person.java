package com.company.EX9.onlineShop;

public class Person {
    String name;
    String TIN;

    public Person(String name, String TIN) {
        this.name = name;
        this.TIN = TIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTIN() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN = TIN;
    }
}
