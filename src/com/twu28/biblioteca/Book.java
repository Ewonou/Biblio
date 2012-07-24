package com.twu28.biblioteca;


public class Book {
    private String name;
    private String author;
    private boolean reserved = false;

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
    public void setReserved() {
        reserved = true;
    }
    public boolean isReserved() {
        return reserved;
    }
}


