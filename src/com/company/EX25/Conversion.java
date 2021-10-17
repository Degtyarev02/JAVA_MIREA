package com.company.EX25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<T> {

    private List<T> list = new ArrayList<>();

    public Conversion(T[] array) {
        list.addAll(Arrays.asList(array));
    }

    public void showList() {
        for (Object ls : list) {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(T element) {
        list.add(element);
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();

        String[] lines = {"q", "w", "e", "r", "t", "y"};
        Conversion<String> listStr = new Conversion(lines);
        listStr.showList();
    }
}
