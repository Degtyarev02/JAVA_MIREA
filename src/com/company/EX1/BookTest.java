package com.company.EX1;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 900);
        Book book2 = new Book("Отцы и дети", 450);

        System.out.println(book1.getAmountOfPages());
        book1.setAmountOfPages(1000);
        System.out.println(book1.getAmountOfPages());

        book1.readBook();
        book1.closeBook();
    }
}
