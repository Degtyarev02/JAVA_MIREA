package com.company.EX9.Students;
//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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class StudUi implements LabClassUi {

    @Override
    public void setNameAndSort() throws EmptyLineException, IncorrectLineException {
        ArrayList<Students> arrayListOfStudents = new ArrayList<>(15);

        for (int i = 0; i < 15; i++) {
            Students tmp;
            String name = "";
            String surName = "";
            Integer GPA = (int) ((Math.random()) * 100);
            int b = (int) ((Math.random()) * 15);
            switch (b) {
                case 1:
                    name = "James";
                    break;
                case 2:
                    name = "Robert";
                    break;
                case 3:
                    name = "John";
                    break;
                case 4:
                    name = "Michael";
                    break;
                case 5:
                    name = "David";
                    break;
                case 6:
                    name = "Richard";
                    break;
                case 7:
                    name = "Joseph";
                    break;
                case 8:
                    name = "Charles";
                    break;
                case 9:
                    name = "Thomas";
                    break;
                case 10:
                    name = "Anthony";
                    break;
                case 11:
                    name = "Paul";
                    break;
                case 12:
                    name = "Kenneth";
                    break;
                case 13:
                    name = "George";
                    break;
                case 14:
                    name = "Gary";
                    break;
                case 0:
                    name = "Ryan";
                    break;
            }

            b = (int) ((Math.random()) * 15);
            switch (b) {
                case 1:
                    surName = "Smith";
                    break;
                case 2:
                    surName = "Jones";
                    break;
                case 3:
                    surName = "Williams";
                    break;
                case 4:
                    surName = "Taylor";
                    break;
                case 5:
                    surName = "White";
                    break;
                case 6:
                    surName = "Martin";
                    break;
                case 7:
                    surName = "Wilson";
                    break;
                case 8:
                    surName = "Evans";
                    break;
                case 9:
                    surName = "King";
                    break;
                case 10:
                    surName = "Reynolds";
                    break;
                case 11:
                    surName = "Green";
                    break;
                case 12:
                    surName = "Johnson";
                    break;
                case 13:
                    surName = "Clark";
                    break;
                case 14:
                    surName = "Lewis";
                    break;
                case 0:
                    surName = "Young";
                    break;
            }
            tmp = new Students(name, surName, GPA);
            arrayListOfStudents.add(tmp);
        }

        System.out.println(arrayListOfStudents);

        Collections.sort(arrayListOfStudents);

        System.out.print("\nSorted array\n");

        System.out.println(arrayListOfStudents);
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                Integer findingGPA;

                System.out.println("Enter a GPA");
                findingGPA = in.nextInt();
                boolean flag = false;
                for (Students student : arrayListOfStudents) {
                    if (student.GPA.equals(findingGPA)) {
                        System.out.println(student);
                        flag = true;
                    }
                }

                if (!flag) {
                    throw new IncorrectLineException("Bad GPA value");
                }


                System.out.println("Enter a Name and Surname");
                String findingName = in.next();
                String findingSurname = in.next();
                if (findingName.isEmpty() || findingSurname.isEmpty())
                    throw new EmptyLineException("Empty name or surname");
                flag = false;
                for (Students student : arrayListOfStudents) {
                    if (student.name.equals(findingName) && student.surname.equals(findingSurname)) {
                        System.out.println(student);
                        flag = true;
                    }
                }
                if (!flag) {
                    throw new IncorrectLineException("Bad name or Surname");
                }

            } catch (IncorrectLineException e) {
                e.printStackTrace();
            }
        }
    }
}

