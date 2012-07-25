package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
    @Test
    public void ShouldSelectABookInLibrary(){
        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        Book first = new Book("Design pattern", "incognito");
        expectedBooks.add(first) ;
        expectedBooks.add(new Book("Design fun", "soon")) ;


        Library library = new Library(expectedBooks);
        boolean successChoice = library.selectBook("Design pattern","incognito");

        assertThat(successChoice, is(true));
        assertTrue(first.getIfReserved());
    }
}
