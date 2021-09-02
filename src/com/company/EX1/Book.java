package com.company.EX1;

public class Book {
    private String title;
    private Integer amountOfPages;

    public Book(String title, Integer amountOfPages) {
        this.title = title;
        this.amountOfPages = amountOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(Integer amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "In book " + title + " " + amountOfPages + " pages.";
    }

    public void readBook() {
        System.out.println("You started reading the book" + title);
    }

    public void closeBook() {
        System.out.println("You finished reading the book" + title);
    }
}
