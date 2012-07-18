package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    private Library library;

    public Biblioteca(Library library) {
        this.library = library;
    }

    public void run() {
        ArrayList<Book> allBooks = library.getAllBooks();
        for(Book book:allBooks) {
            System.out.printf("%s - %s\n",book.getName(), book.getAuthor());
        }
    }
}
