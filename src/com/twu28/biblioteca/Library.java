package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    public HashMap<String,String> ReservedBooksWithUser = new HashMap<String, String>();

    public Library(ArrayList<Book> expectedBooks) {

        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void reserveBook(int idNumber, String userName) {

        ReservedBooksWithUser.put(Integer.toString(idNumber),userName);

    }
}
