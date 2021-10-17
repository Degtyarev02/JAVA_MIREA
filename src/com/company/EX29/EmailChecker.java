package com.company.EX29;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class EmailChecker {
    public static void main(String[] args) {
        String regex = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Email: " + s + ": " + pattern.matcher(s).matches());
    }
}
