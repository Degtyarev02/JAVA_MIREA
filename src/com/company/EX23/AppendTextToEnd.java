package com.company.EX23;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AppendTextToEnd {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\JAVA_MIREA\\src\\com\\company\\EX23\\file.txt", true);
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(" ");
            writer.write(text);
            writer.close();
            FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\JAVA_MIREA\\src\\com\\company\\EX23\\file.txt");
            int symbol;
            while ((symbol=reader.read())!= -1) {
                System.out.print((char) symbol);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
