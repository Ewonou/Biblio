package com.twu28.biblioteca;


public class Book {
    private String name;
    private String author;
    private int idNumber;
    private int quantity;


    public Book(String bookName, String authorName, int Id, int qty) {
        name = bookName;
        author = authorName;
        idNumber = Id;
        quantity = qty;
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

    public int decreaseBookQty() {
        return --quantity;
    }

    public boolean isBookAvailable() {
        return (quantity > 0);
    }
}


