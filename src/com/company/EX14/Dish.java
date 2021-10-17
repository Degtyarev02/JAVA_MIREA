package com.company.EX14;

public class Dish implements Item{
    private final String  name;
    private final String  description;
    private final Integer price;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public Dish(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
}
