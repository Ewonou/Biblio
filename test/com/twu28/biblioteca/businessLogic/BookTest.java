package com.twu28.biblioteca.businessLogic;

import com.twu28.biblioteca.businessLogic.Book;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import static junit.framework.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void settingABook(){
        book = new Book("bookName", "authorName",12,1);
    }

    @Test
    public void shouldPopulateNameAndAuthor(){
    settingABook();
    assertEquals("bookName", book.getName());
    assertEquals("authorName", book.getAuthor());
}

    @Test
    public void ShouldReturnBookIdNumber(){
    settingABook();
    assertEquals(book.getIdNumber(),12);}

    @Test
    public void ShouldDecreaseBookQuantity(){
     settingABook();
     assertEquals(0 , book.decreaseBookQty());
    }

    @Test
    public void ShouldDetermineBookAvailability(){
        settingABook();
        assertTrue(book.isBookAvailable());
        book.decreaseBookQty();
        assertFalse(book.isBookAvailable());
    }


}

