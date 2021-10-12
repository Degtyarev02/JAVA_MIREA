package com.company.EX6;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.Arrays;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    private static int countId = 0;
    private int id;
    private String name;
    private double GPA;

    public SortingStudentsByGPA(String name, double GPA) {
        this.id = countId++;
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(SortingStudentsByGPA o) {
        return (int) (this.GPA - o.getGPA() );
    }

    public static void Quick_Sort( SortingStudentsByGPA[] data, int left,int right) {
        int i;
        int j;
        SortingStudentsByGPA pivot;
        SortingStudentsByGPA temp;
        i = left;
        j = right;
        pivot = data[(left + right) / 2];
        do
        {
            while ((data[i].compareTo(pivot) > 0) && (i < right)) i++;

            while ((data[j].compareTo(pivot) < 0) && (j > left)) j--;
            ;
            if (i <= j)
            {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) Quick_Sort(data, left, j);
        if (i < right) Quick_Sort(data, i, right);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA s1 = new SortingStudentsByGPA("Jack", 3.4);
        SortingStudentsByGPA s2 = new SortingStudentsByGPA("Mike", 5.0);
        SortingStudentsByGPA s3 = new SortingStudentsByGPA("Kant", 2.3);
        SortingStudentsByGPA s4 = new SortingStudentsByGPA("Barry", 7.4);

        SortingStudentsByGPA[] students = {s1, s2, s3, s4};
        Quick_Sort(students, 0, 3);
        System.out.println(Arrays.toString(students));
    }
}
