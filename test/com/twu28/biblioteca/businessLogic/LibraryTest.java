package com.twu28.biblioteca.businessLogic;

import com.twu28.biblioteca.businessLogic.Book;
import com.twu28.biblioteca.businessLogic.Library;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    public ByteArrayOutputStream setOutputStream() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        return outStream;
    }

    private void changeUserInputTo(String menuChoice) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(menuChoice.getBytes());
        System.setIn(inputStream);
    }

    public Library setupLibrary() {
        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(new Book("First", "Dan",1,2)) ;
        expectedBooks.add(new Book("Second", "Switzer",2,3)) ;
        return new Library(expectedBooks);
    }

    @Test
    public void ShouldReturnAllTheBooksInTheLibrary() {
        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(new Book("", "",1,0)) ;
        expectedBooks.add(new Book("", "",2,0)) ;
        Library library = new Library(expectedBooks);
        ArrayList<Book> books =  library.getAllBooks();
        assertEquals(expectedBooks.get(0), books.get(0));
        assertEquals(expectedBooks.get(1), books.get(1));
    }

    @Test
    public void ShouldAddBookIdAndUserToReservedList(){
     Library sut =  setupLibrary();
     sut.AddBookIdAndUserToReservedList(1,"Armand");
     sut.AddBookIdAndUserToReservedList(1,"Tony");
     sut.AddBookIdAndUserToReservedList(2,"Angelo");
    HashMap<String,ArrayList<String>> reservation = sut.getBookReservation();

    assertTrue(reservation.containsKey("1"));
    assertTrue(reservation.get("1").contains("Armand"));
    assertTrue(reservation.get("1").contains("Tony"));
    assertTrue(reservation.get("2").contains("Angelo"));
    }

   @Test
    public void ShouldReserveABook(){

        Library library = setupLibrary();
        library.reserveBook(1,"Franck");
        library.reserveBook(1,"Johnny");
        ArrayList<String> userNames = library.getBookReservation().get("1");
        assertTrue(library.getBookReservation().containsKey("1"));
        assertEquals("Johnny",userNames.get(1));
        assertEquals("Franck",userNames.get(0));
    }

/*
     @Test
    public void ShouldReturnMsgIfBookNotAvailable(){
        Library library = setupLibrary();
        ByteArrayOutputStream outStream = setOutputStream();
        library.reserveBook(3,"Torque");
        String result = outStream.toString();
        assertThat(result, is("Sorry we don't have that book yet"));
    }
    */

}
