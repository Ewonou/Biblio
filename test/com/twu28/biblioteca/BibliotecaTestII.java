package com.twu28.biblioteca;

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: eaziakon
 * Date: 7/25/12
 * Time: 1:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaTestII{
    @Before public void initialize()
    {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor",120));
        books.add(new Book("Head First Java","Kathy Sierra",12));
        Library lib = new Library(books);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu("Display"));
        MenuManager menuManager = new MenuManager(menus);
        Biblioteca go = new Biblioteca(lib, menuManager);
        go.run();

    }

}
