package com.company.EX25;

import java.util.Arrays;

public class AnyArray <T>{
    private T[] arr;

    public AnyArray(T[] arr) {
        this.arr = arr;
    }

    public T get(int index){
        return arr[index];
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        String[] strArr = {"ads", "dasd", "dawwa"};
        Integer[] intArr = {1, 2, 3, 4};
        Double[] doubleArr = {2.1, 2.4, 23.5, 10.0};

        AnyArray<String> stringAnyArray = new AnyArray<>(strArr);
        AnyArray<Integer> integerAnyArray = new AnyArray<>(intArr);
        AnyArray<Double> doubleAnyArray = new AnyArray<>(doubleArr);
        System.out.println(stringAnyArray);
        System.out.println(integerAnyArray);
        System.out.println(doubleAnyArray);

        //Тут же задание 3, возврат элемента по индексу
        String tmp = stringAnyArray.get(1);
        Integer tmpInt = integerAnyArray.get(2);
        Double tmpDouble = doubleAnyArray.get(3);
        System.out.println(tmp);
        System.out.println(tmpInt);
        System.out.println(tmpDouble);

    }
}
