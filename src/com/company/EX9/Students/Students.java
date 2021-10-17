package com.company.EX9.Students;

public class Students implements Comparable<Students>{
    public String name;
    public String surname;
    public Integer GPA;

    public Students(String name, String surname, Integer GPA) {
        this.name = name;
        this.surname = surname;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + GPA;
    }

    @Override
    public int compareTo(Students o) {
        return GPA.compareTo(o.GPA);
    }
}
