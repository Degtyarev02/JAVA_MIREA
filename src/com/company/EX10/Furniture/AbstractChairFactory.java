package com.company.EX10.Furniture;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);
    Chair createMultifunctionalChair();
    Chair createMagicChair();
}
