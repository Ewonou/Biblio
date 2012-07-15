package com.twu28.biblioteca;
import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

@Test
	public void DoesPanelWelcome() {
		assertEquals(new Biblioteca().getPanelMessage(),"Welcome");
	}

@Test
	public void DoesFrameHaveMultipleOptions(){
	Ensemble.Biblioteca go = new Ensemble.Biblioteca();
	go.mainFrameBuilder();
	assertTrue(go.numberOfMenuItems > 0);
}
}
