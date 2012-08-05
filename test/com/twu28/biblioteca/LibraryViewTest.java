package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryViewTest {
    ByteArrayOutputStream outStream;

    @Before
    public void setUpOutputStream(){
     outStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outStream);
    System.setOut(printStream);
    }

   @Test
    public void ShouldDisplayLibraryBooks(){
    setUpOutputStream();
    ArrayList<Book> books = new ArrayList<Book>();
    books.add(new Book("GoodBook","GoodAuthor",7,1));
    books.add(new Book("AwesomeBook","AwesomeAuthor",3,2));
    Library lib = new Library(books);

    LibraryView sut = new LibraryView(lib);

   int numberOfBooksDisplayed = sut.displayAllBooks();
    assertEquals(lib.numberOfBooks(),numberOfBooksDisplayed);
    assertEquals("GoodBook By GoodAuthor, ID# 7\nAwesomeBook By AwesomeAuthor, ID# 3\n", outStream.toString());
}
   @Test
    public void shouldInformOfAbsenceOfBook(){
       setUpOutputStream();
       Library lib = mock(Library.class);
       LibraryView sut = new LibraryView(lib);
       sut.informOfAbsenceOfBook();
       assertEquals("Sorry we don't have that book yet\n",outStream.toString());
   }

    @Test
    public void shouldNotifyOfSuccessfulBookReserve(){
        setUpOutputStream();
        Library lib = mock(Library.class);
        LibraryView sut = new LibraryView(lib);
        sut.thanksUser();
        assertEquals("Thank You! Enjoy the book.\n",outStream.toString());
    }
}
