package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;


public class MenuManagerViewTest {
    private ByteArrayOutputStream outStream;

    private void outputSetup(){
        outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
    }
    @Test
    public void ShouldDisplaySelectAValidOption(){
        outputSetup();
       MenuManagerView go = new MenuManagerView();
       go.notifyUserToSelectValidOption();

       assertEquals("Select a valid Option!!",outStream.toString());
    }

}
