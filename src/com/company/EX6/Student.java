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

    public static void insert_sort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && (arr[j - 1].compareTo(arr[j])) > 0; j--) {
                Student tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    private static Student[] mergeArrays(Student[] a1, Student[] a2) {
        Student[] result = new Student[a1.length + a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a2.length, a2.length);
        return result;
    }

    private static void mergeSort(Student[] a, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);

        Student[] buffer = Arrays.copyOf(a, a.length);

        for (int k = low; k <= high; k++) {
            buffer[k] = a[k];
        }

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = buffer[j];
                j++;
            } else if (j > high) {
                a[k] = buffer[i];
            } else if (buffer[j].compareTo(buffer[i]) < 0) {
                a[k] = buffer[j];
                j++;
            } else {
                a[k] = buffer[i];
                i++;
            }
        }
    }

        public static void main (String[]args){
            Student s1 = new Student("s1");
            Student s2 = new Student("s2");
            Student s3 = new Student("s3");
            Student s4 = new Student("s4");

            Student[] students1 = {s3, s2, s4, s1};

            Student s5 = new Student("s5");
            Student s6 = new Student("s6");
            Student s7 = new Student("s7");
            Student s8 = new Student("s8");

            Student[] students2 = {s5, s8, s6, s7};

            insert_sort(students1);
            System.out.println(Arrays.toString(students1));

            Student[] merged_students_array = mergeArrays(students1, students2);
            mergeSort(merged_students_array, 0, merged_students_array.length - 1);
            System.out.println(Arrays.toString(merged_students_array));

        }
    }
