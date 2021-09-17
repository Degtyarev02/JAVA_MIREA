package com.company.EX23;

import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\JAVA_MIREA\\src\\com\\company\\EX23\\file.txt");
            int symbol;
            while ((symbol=reader.read())!= -1) {
                System.out.print((char) symbol);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}