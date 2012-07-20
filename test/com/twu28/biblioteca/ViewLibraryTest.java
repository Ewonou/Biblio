package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ViewLibraryTest {

   @Test
    public void ShouldDisplayLibraryBooks(){
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outStream);
    System.setOut(printStream);

    ArrayList<Book> books = new ArrayList<Book>();
    books.add(new Book("GoodBook","GoodAuthor"));
    Library lib = new Library(books);

    ViewLibrary sut = new ViewLibrary(lib);

    sut.display();

    assertEquals("GoodBook By GoodAuthor", outStream.toString());

}
}
