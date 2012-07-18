package com.twu28.biblioteca;


public class Book {
    private String name;
    private String author;

    public Book(String bookName, String authorName) {
        name = bookName;
        author = authorName;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}


