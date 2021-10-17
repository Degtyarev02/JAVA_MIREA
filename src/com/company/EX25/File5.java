package com.company.EX25;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class File5 {
    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(fArray));

        for (int i =0; i<5;i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Filelist("C:\\");
    }
}
