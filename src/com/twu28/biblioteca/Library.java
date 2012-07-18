package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> expectedBooks) {

        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
