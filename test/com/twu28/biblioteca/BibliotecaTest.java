package com.twu28.biblioteca;
import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.internal.matchers.StringContains;

public class BibliotecaTest {
            private String msg = "Welcome to Biblioteca";
@Test
	public void DoesPanelWelcome() {
		assertEquals(new View().getWelcomeMsg(),msg);
	}

    @Test
    public void moreThanOneMenuOptions() {
        assertTrue( new View_Biblioteca().getNumberofMenu() > 1);
    }

}
