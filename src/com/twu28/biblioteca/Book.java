package com.twu28.biblioteca;


public class Book {
    private String name;
    private String author;
    private int idNumber;

    public Book(String bookName, String authorName, int Id) {
        name = bookName;
        author = authorName;
        idNumber = Id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getIdNumber() {
        return idNumber;
    }
}


