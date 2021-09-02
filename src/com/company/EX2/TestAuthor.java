package com.company.EX2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "ivan1980@mail.ru", 'm');
        Author author2 = new Author("Vladimir", "vld@mail.ru", 'm');

        System.out.println(author1.getEmail());
        author1.setEmail("vanya@gmail.com");
        System.out.println(author1.getEmail());

        System.out.println(author1);
    }
}
