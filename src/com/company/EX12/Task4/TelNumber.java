package com.company.EX12.Task4;

public class TelNumber {

    public static String reformat(String tel) {
        tel = new StringBuilder(tel).insert(1, "(").toString();
        tel = new StringBuilder(tel).insert(5, ")-").toString();
        tel = new StringBuilder(tel).insert(10, "-").toString();
        return tel;
    }

    public static String convertTelNumber(String tel) {
        String result;
        if (tel.charAt(0) == '+') {
            result = reformat(tel.substring(1));
            return new StringBuilder(result).insert(0, "+").toString();
        } else {
            return reformat(tel);
        }
    }

    public static void main(String[] args) {
        System.out.println(convertTelNumber("+79263262344"));
        System.out.println(convertTelNumber("89263262344"));
    }
}
