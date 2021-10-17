package com.company.EX30;

import java.util.Scanner;
import java.util.regex.Pattern;
public class PasswordChecker {
    public static void main(String[] args) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d@$!%*#?&_-]{8,}";
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Password: " + s + ": " + pattern.matcher(s).matches());
    }
}
