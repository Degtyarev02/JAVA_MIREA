package com.company.EX17;

public class Book2Test {
    public static void main(String[] args) {
        Book2 book1 = new Book2("In Search of Lost Time", 1913, "Marcel Proust");
        Book2 book2 = new Book2("Ulysses", 1904, "James Joyce");
        Book2 book3 = new Book2("One Hundred Years of Solitude", 1910, "Gabriel Garcia Marquez");
        System.out.println(book1 + "\n" + book2 + "\n" + book3);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        System.out.println(book1.getTitle());
        book1.setYear(1912);
        System.out.println(book1.getYear());
    }
}
