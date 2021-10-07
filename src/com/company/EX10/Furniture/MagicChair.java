package com.company.EX10.Furniture;

public class MagicChair implements Chair{
    @Override
    public String typeOfChair() {
        return "Вы выбрали магический стул. -100 к усталости +200 к продуктивности.";
    }
}
