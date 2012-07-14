package Ensemble;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

@Test
	public void DoesPanelWelcome() {
		assertEquals(new Biblioteca().getPanelMessage(),"Welcome");
	}

@Test
	public void DoesFrameHaveMultipleOptions(){
	Biblioteca go = new Biblioteca();
	go.mainFrameBuilder();
	assertTrue(go.numberOfMenuItems > 0);
}
}
