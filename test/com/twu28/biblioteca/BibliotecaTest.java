package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static java.lang.String.copyValueOf;
import static junit.framework.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void ShouldDisplayAWelcomeAtStart()
    {   //Setup
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor"));
        Library lib = new Library(books);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu("Display"));
        MenuManager menuManager = new MenuManager(menus);
        Biblioteca go = new Biblioteca(lib, menuManager);
        go.run();
        //

        StringBuffer holder = new StringBuffer();
        String temp =  outStream.toString();

        for(int i = 0; i< 7; i ++)
        {
            holder.append(temp.charAt(i));
        }
        assertEquals(holder.toString(), "Welcome");

    }

    @Test
    public void ShouldDisplayMenuAtStart(){
        //Setup
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor"));
        Library lib = new Library(books);

        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu("Display"));
        MenuManager menuManager = new MenuManager(menus);
        Biblioteca go = new Biblioteca(lib, menuManager);
        go.run();
        //

        ViewMenu infoMenu = new ViewMenu(menuManager);
        int charCount = infoMenu.getMenuItemCharacterOccupancy();

        StringBuffer holder = new StringBuffer();
        String temp =  outStream.toString();

        for(int i = 7; i< 15 ; i ++)
        {
            holder.append(temp.charAt(i));
        }
        assertEquals("\nDisplay", holder.toString());

    }

    }




