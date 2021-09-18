package com.company.EX16;

import com.company.Main;

import java.util.Arrays;

public class Sum {
    static int sumFor(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int sumWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    static int sumDoWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        return sum;
    }

    static int factorial(int target) {
        int result = 1;
        for(int i = 2; i < target+1; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        //Task1
        System.out.println("Task 1");
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumFor(arr));
        System.out.println(sumWhile(arr));
        System.out.println(sumDoWhile(arr));

        //Task2
        System.out.println("Task 2");
        for (String arg : args) {
            System.out.println(arg);
        }

        //Task3
        System.out.println("Task 3");
        double sum = 0.0;
        for (double i = 1; i < 11; i++) {
            sum += 1 / i;
        }
        System.out.println(sum);


        //Task4
        System.out.println("Task 4");
        int []rand = new int[5];
        for(int i = 0; i < 5; i++){
            rand[i] = (int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(rand));
        Arrays.sort(rand);
        System.out.println(Arrays.toString(rand));



        //Task5
        System.out.println("Task 5");
        System.out.println(factorial(5));
        System.out.println(factorial(3));



    }
}
