package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class BibliotecaViewTest {

    private ByteArrayOutputStream outStream;

    private ByteArrayOutputStream outputSetup(){
     outStream = new ByteArrayOutputStream();
     PrintStream printStream = new PrintStream(outStream);
     System.setOut(printStream);
     return outStream;
    }

    @Test
    public void ShouldDisplayWelcome(){
    outStream = outputSetup();
    BibliotecaView view = new BibliotecaView();
    Biblioteca go = new Biblioteca(view);
    go.run();
    StringBuffer holder = new StringBuffer();
    String temp =  outStream.toString();
    for(int i = 0; i< 7; i ++){
            holder.append(temp.charAt(i));
        }
    assertEquals(holder.toString(), "Welcome");
    }

}

