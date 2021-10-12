package com.company.EX10.Editor;

import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        ICreateDocument createDocument = new CreateTextDocument();
        IDocument textDoc = null;
        System.out.println("File");
        System.out.println("\tNew");
        System.out.println("\tOpen");
        System.out.println("\tSave");
        System.out.println("\tExit");
        int a = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            a = in.nextInt();
            if (a == 1) {
                textDoc = createDocument.createNew();
                System.out.println(textDoc.docType() +" created!");
            } else if (a == 2) {
                textDoc = createDocument.createOpen();
                System.out.println(textDoc.docType() + " open!");
            } else if (a == 3) {
                if (textDoc == null) {
                    System.out.println("Document is not found");
                } else {
                    System.out.println(textDoc.docType() +" saved!");
                }
            } else if (a == 4) {
                return;
            }
        }
    }
}
