package com.twu28.biblioteca;
import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Test;

public class BibliotecaTest {
    Biblioteca go = new Biblioteca();


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
}