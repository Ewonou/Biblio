package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    @Test
    public void ShouldReturnAllTheBooksInTheLibrary() {
        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(new Book("", "")) ;
        expectedBooks.add(new Book("", "")) ;

        Library library = new Library(expectedBooks);
        ArrayList<Book> books =  library.getAllBooks();

        assertEquals(expectedBooks.get(0), books.get(0));
        assertEquals(expectedBooks.get(1), books.get(1));
    }
}
