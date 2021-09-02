package com.company.EX1;

public class Dog {
    private String name;
    private Integer age;


    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name= " + name +
                        ", age=" + age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human years = " + age * 7 + "years");
    }
}
