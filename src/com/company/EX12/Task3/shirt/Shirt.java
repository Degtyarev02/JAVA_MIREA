package com.company.EX12.Task3.shirt;

public class Shirt {
    private String vendorCode;
    private String title;
    private String color;
    private String size;

    public Shirt(String vendorCode, String title, String color, String size) {
        this.vendorCode = vendorCode;
        this.title = title;
        this.color = color;
        this.size = size;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "vendorCode='" + vendorCode + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
