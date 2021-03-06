package com.twu28.biblioteca.Presenter;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.mockito.Mockito.mock;


public class BibliotecaViewTest {

    private ByteArrayOutputStream outStream;

    private void outputSetup(){
     outStream = new ByteArrayOutputStream();
     PrintStream printStream = new PrintStream(outStream);
     System.setOut(printStream);
    }

    @Test
    public void ShouldDisplayWelcome(){
    outputSetup();
    Biblioteca go = new Biblioteca();
    go.run();
    StringBuffer holder = new StringBuffer();
    String temp =  outStream.toString();
    for(int i = 0; i< 7; i ++){
            holder.append(temp.charAt(i));
        }
    assertEquals(holder.toString(), "Welcome");
    }

}

