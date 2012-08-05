package com.twu28.biblioteca.userInterface;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;


public class MenuViewTest {
    private ByteArrayOutputStream outStream;

    private void outputSetup(){
        outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
    }
    @Test
    public void ShouldDisplaySelectAValidOption(){
        outputSetup();
       MenuView go = new MenuView();
       go.notifyUserToSelectValidOption();

       assertEquals("Select a valid Option!!",outStream.toString());
    }

}
