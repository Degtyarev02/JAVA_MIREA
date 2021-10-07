package com.company.EX10.Complex;

public class Test {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex firstComplex = factory.createComplex();
        Complex secondComplex = factory.createComplex(2, 4);

        System.out.println(firstComplex.sub(secondComplex));
    }
}
