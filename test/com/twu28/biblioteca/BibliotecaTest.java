package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaTest {
    @Test
    public void shouldDisplayAllLibraryBooksWhenRun() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(stream);
        System.setOut(outputStream);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("testBook","testAuthor"));
        books.add(new Book("anotherBook","anotherAuthor"));
        Library library = new Library(books);

        new Biblioteca(library).run();

        assertEquals("testBook - testAuthor\nanotherBook - anotherAuthor\n", stream.toString())   ;
    }
}

