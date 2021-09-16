package com.company.EX16;

import com.company.Main;

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
        while(i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    static int sumDoWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum+=arr[i];
            i++;
        } while (i < arr.length);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumFor(arr));
        System.out.println(sumWhile(arr));
        System.out.println(sumDoWhile(arr));
    }
}
