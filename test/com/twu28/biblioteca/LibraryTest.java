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
        expectedBooks.add(new Book("", "",1)) ;
        expectedBooks.add(new Book("", "",2)) ;

        Library library = new Library(expectedBooks);
        ArrayList<Book> books =  library.getAllBooks();

        assertEquals(expectedBooks.get(0), books.get(0));
        assertEquals(expectedBooks.get(1), books.get(1));
    }
    @Test
    public void ShouldReserveABook(){
        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(new Book("First", "Dan",1)) ;
        expectedBooks.add(new Book("Second", "Switzer",2)) ;
        Library library = new Library(expectedBooks);

        library.reserveBook(1,"Franck");
        library.reserveBook(1,"Johnny");

        ArrayList<String> userNames = library.ReservedBooksWithUser.get("1");

        assertTrue(library.ReservedBooksWithUser.containsKey("1"));
        //assertEquals("Johnny",userNames.get(0));
        //assertEquals("Franck",userNames.get(1));
    }
}
