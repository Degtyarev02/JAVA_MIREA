package com.company.EX17;

public class Book2 {
    private String title;
    private Integer year;
    private String author;

    public Book2(String title, Integer year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " +
                "title = '" + title +
                ", year = " + year +
                ", author = '" + author;
    }
}
