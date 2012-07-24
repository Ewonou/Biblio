package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class BookTest {
@Test
    public void shouldPopulateNameAndAuthor(){
    Book book = new Book("bookName", "authorName");

    assertEquals("bookName", book.getName());
    assertEquals("authorName", book.getAuthor());
}

}
