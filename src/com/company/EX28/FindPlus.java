package com.company.EX28;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPlus {
    public static void main(String[] args) {
        ArrayList<String> matches = new ArrayList<>();
        String regex = ".[0-9]+[ ]*[+].*";
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Expression: " + s + ": " + pattern.matcher(s).matches());
    }
}
