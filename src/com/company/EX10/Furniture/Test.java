package com.company.EX10.Furniture;

public class Test {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Chair chair = factory.createMagicChair();
        Chair chair1 = factory.createVictorianChair(120);
        Chair chair2 = factory.createMultifunctionalChair();

        Client client = new Client();
        client.sit(chair);
        client.sit(chair1);
        client.sit(chair2);
    }
}
