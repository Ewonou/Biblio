package com.twu28.biblioteca;

import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class BookTest {
@Test
    public void shouldPopulateNameAndAuthor(){
    Book book = new Book("bookName", "authorName",12);

    assertEquals("bookName", book.getName());
    assertEquals("authorName", book.getAuthor());
}

@Test
public void ShouldReturnBookIdNumber(){
    Book book = new Book("bookName","authorName",12);

    assertEquals(book.getIdNumber(),12);

}

@Test
    public void ShouldPopulateNameAndAuthorMockito(){
    Book book = mock(Book.class);
    when(book.getName()).thenReturn("bookName");
    when(book.getAuthor()).thenReturn("bookAuthor");

    String resultName = book.getName();
    String resultAuthor = book.getAuthor();
    assertEquals(resultAuthor,"bookAuthor");
    assertEquals(resultName,"bookName" );
}


}
