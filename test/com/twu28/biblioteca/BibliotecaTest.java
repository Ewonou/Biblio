package com.twu28.biblioteca;
import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Test;

public class BibliotecaTest {
    Biblioteca go = new Biblioteca();
    BookManager now = new BookManager();


@Test
	public void isWelcomeDisplayed() {

    Assert.assertTrue(go.displayMessage()== "Welcome");
}

@Test
    public void isThereMoreThanOneOption(){
    Assert.assertTrue(go.displayOptions()> 1);
}

@Test
    public void canSelectMenuOption(){
    Assert.assertTrue(go.selectAnOption("Menu1"));
}
 @Test
    public void doesInvalidInputDisplayMsg(){
    Assert.assertFalse(go.selectAnOption("no"));
}
 @Test
 public void canCustomerViewAllBooks(){
    int bookCount = now.displayBooks();
    Assert.assertTrue(bookCount == 3);
 }
 @Test
 public void canReserveBook()
 {
     Assert.assertTrue(now.bookReservation(1));
 }

    @Test
    public void isCustomerNotifiedOfSuccessfulReserve()
    {
        Assert.assertTrue(now.successfulReserved(2));
    }

}