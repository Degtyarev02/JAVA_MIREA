package com.company.EX12.Task3.shirt;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White TShirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] shirts = new Shirt[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] tmp = arr[i].split("\\,");
            shirts[i] = new Shirt(tmp[0], tmp[1], tmp[2], tmp[3]);
        }

        for (Shirt i : shirts) {
            System.out.println(i);
        }
    }
}
