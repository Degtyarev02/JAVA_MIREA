package com.company.EX27;

import java.util.Scanner;

public class ConsoleSplitString {
    public static void main(String[] args) {

        StringBuilder symbol = new StringBuilder("\\");
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку");
            String line;
            line = in.nextLine();
            System.out.println("Введите по какому символу разбить строку");
            symbol.append(in.next());

            String[] arr = line.split(String.valueOf(symbol));
            for (String element:arr){
                System.out.println(element);
            }
        }
    }
}
