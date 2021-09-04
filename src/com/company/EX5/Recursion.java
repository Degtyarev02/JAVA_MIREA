package com.company.EX5;

import java.util.Scanner;

public class Recursion {
    public static String recursion_for_prime_number(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return "NO";
        } else if (n == 2) {
            return "YES";
        } else if (n % i == 0) {
            return "NO";
        } else if (i < n / 2) {
            return recursion_for_prime_number(n, i + 1);
        } else {
            return "YES";
        }
    }

    public static void recursion_for_number_multiplier(int n, int m) {
        if (m > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % m == 0) {
            System.out.println(m);
            recursion_for_number_multiplier(n / m, m);
        } else {
            recursion_for_number_multiplier(n, ++m);
        }
    }

    public static String palindrome(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return palindrome(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(recursion_for_prime_number(n, 2)); // вызов рекурсивной функции
        recursion_for_number_multiplier(n, 2);
        System.out.println(palindrome("radar"));
    }
}
