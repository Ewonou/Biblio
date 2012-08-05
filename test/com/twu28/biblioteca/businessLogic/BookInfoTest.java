package com.twu28.biblioteca.businessLogic;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: eaziakon
 * Date: 8/6/12
 * Time: 3:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookInfoTest {

@Test
    public void ShouldReturnBookInfo(){

    Book book = new Book("bookName", "authorName",12,1);
    BookInfo sut = new BookInfo(book);
    assertEquals(sut.getName(),book.getName());
    assertEquals(sut.getAuthor(),book.getAuthor());
    assertEquals(sut.getIdNumber(),book.getIdNumber());
}
}
