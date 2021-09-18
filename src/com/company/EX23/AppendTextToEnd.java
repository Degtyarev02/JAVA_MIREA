package com.company.EX23;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AppendTextToEnd {
    public static void main(String[] args) {
        final String patchToWin = "C:\\Users\\User\\Desktop\\JAVA_MIREA\\src\\com\\company\\EX23\\file.txt";
        final String patchToLin = "/home/vladimir/Рабочий стол/JAVA_MIREA/src/com/company/EX23/file.txt";
        try {
            //Patch to linux
            //Patch to win
            FileWriter writer = new FileWriter(patchToLin, true);
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(" ");
            writer.write(text);
            writer.close();
            FileReader reader = new FileReader(patchToLin);
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
