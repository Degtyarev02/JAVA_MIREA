package com.company.EX22;

public class TestMyArraySimpleList {
    public static void main(String[] args) {
        Simple<Integer> simple = new SimpleArray<>();
        simple.add(2);
        simple.add(3);
        simple.add(6);
        simple.add(8);
        simple.add(10);
        simple.add(35);
        System.out.println(simple);
        System.out.println(simple.get(2));
        System.out.println(simple.size());
        simple.set(2, 43);
        simple.remove();
        System.out.println(simple);
        simple.sort();
        System.out.println(simple);
        simple.clear();
        System.out.println(simple);
    }
}
