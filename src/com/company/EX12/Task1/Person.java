package com.company.EX12.Task1;

public class Person {
    String name;
    String surname;
    String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    String formatNSP() {
        char n, p;
        String np = "";
        if (!name.isEmpty()) {
            n = name.charAt(0);
            np +=(n + ".");
        }
        if (!patronymic.isEmpty()) {
            p = patronymic.charAt(0);
            np += p + ".";
        }
        if(!np.isEmpty() ){
            return surname + " " + np;
        } else {
            return surname;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("", "Degtyarev", "Sergeevich");
        System.out.println(person.formatNSP());
    }
}
