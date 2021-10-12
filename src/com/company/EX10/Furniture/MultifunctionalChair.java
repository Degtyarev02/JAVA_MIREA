package com.company.EX10.Furniture;

public class MultifunctionalChair implements Chair{
    public int sum(int a, int b){
        return a+b;
    }

    @Override
    public String typeOfChair() {
        return "Вы выбрали мультифункциональный стул";
    }
}
