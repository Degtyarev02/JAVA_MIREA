package com.company.EX29;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateChecker {
    public static void main(String[] args) {
        String regex = "([012]\\d|3[01])/(0[1-9]|1[0-2])/(1[6-9]\\d{2}|[2-9]\\d{3})";
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Date: " + s + ": " + pattern.matcher(s).matches());
    }
}
