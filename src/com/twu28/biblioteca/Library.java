package com.twu28.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> expectedBooks) {

        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
