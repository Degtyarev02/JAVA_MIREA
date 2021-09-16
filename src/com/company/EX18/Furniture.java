package com.company.EX18;

public abstract class Furniture {
    private String material;
    private String title;
    private Integer price;

    public Furniture( String title, String material, Integer price) {
        this.material = material;
        this.title = title;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public abstract void assembleFurniture();
}
