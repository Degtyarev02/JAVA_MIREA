package com.company.EX10.Furniture;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }
}
