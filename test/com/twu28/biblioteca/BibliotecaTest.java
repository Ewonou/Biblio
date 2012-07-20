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
        MenuList menuList = new MenuList(menus);
        Biblioteca go = new Biblioteca(lib,menuList);
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
        MenuList menuList = new MenuList(menus);
        Biblioteca go = new Biblioteca(lib,menuList);
        go.run();
        //

        ViewMenu infoMenu = new ViewMenu(menuList);
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




