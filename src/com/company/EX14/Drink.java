package com.company.EX14;

import java.util.Locale;

public final class Drink implements Item, Alcoholable{
    private final String name;
    private final String description;
    private final Integer price;
    private final Double alcoholVol;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
        this.alcoholVol = 0.0;
    }

    public Drink(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholVol = 0.0;
    }

    public Drink(String name, String description, Integer price, Double alcoholVol) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholVol = alcoholVol;
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

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    public DrinkTypeENUM getType(){
        String type = getName();
        return DrinkTypeENUM.valueOf(type.toUpperCase(Locale.ROOT));
    }
}
