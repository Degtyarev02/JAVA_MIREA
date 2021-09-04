package com.company.EX6;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private static int countId = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.id = countId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id - o.getId());
    }

    @Override
    public String toString() {
        return name;
    }

    public static void insert_sort(Student[]arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && (arr[j - 1].compareTo(arr[j])) > 0; j--) {
                Student tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        Student s3 = new Student("s3");
        Student s4 = new Student("s4");

        Student[] students = {s3, s2, s4, s1};
        insert_sort(students);
        System.out.println(Arrays.toString(students));

    }
}
