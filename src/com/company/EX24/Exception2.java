package com.company.EX24;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        int i = 0;
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException e){
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (Exception e){
            System.out.println("Unknown exception");
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }

}
