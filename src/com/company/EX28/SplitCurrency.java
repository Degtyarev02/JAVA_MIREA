package com.company.EX28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitCurrency {
    public static void main(String[] args) {
        String regex = "(\\d+\\.\\d{2}(USD|UA|RUB|EUR))";
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Список цен: " + m1.group());}
    }
}
