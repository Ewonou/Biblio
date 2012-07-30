package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static java.lang.String.copyValueOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaTest {


    }

/*
 @Test
    public void ShouldDisplayAWelcomeAtStart()
    {   //Setup
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor",3));
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
        books.add(new Book("GoodBook","GoodAuthor",4));
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

    @Test
    public void ShouldSelectAMenuItemFromAStringInput(){
        ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
        expectedMenu.add(new Menu ("Show"));
        expectedMenu.add(new Menu("View"));

        String userInput = "View";
        MenuManager menuManager = new MenuManager(expectedMenu);
        menuManager.selectAMenu(menuManager.stringToMenuConverter(userInput));
        assertTrue(expectedMenu.get(1).selected);
    }

    @Test
    public void ShouldSelectAMenu()
    {

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor",5));
        Library lib = new Library(books);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        Menu view = new Menu("view");
        Menu reserve = new Menu("reserve");
        menus.add(view);
        menus.add(reserve);

        MenuManager menuManager = new MenuManager(menus);
        Biblioteca go = new Biblioteca(lib, menuManager);
        go.run();

       //assertEquals(go.selection,"view");
       assertTrue(go.selectedItem);
    }

    @Test
    public void ShouldTellUserToSelectValidInput(){

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("GoodBook","GoodAuthor",6));
        Library lib = new Library(books);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        Menu View = new Menu("View");
        menus.add(View);

        MenuManager menuManager = new MenuManager(menus);
        Biblioteca go = new Biblioteca(lib, menuManager);
        go.run();

        String InvalidInputMsg = outStream.toString();

        StringBuffer holder = new StringBuffer ();
        for (int i = 43; i < InvalidInputMsg.length();i++){
            holder.append(InvalidInputMsg.charAt(i));
        }
        assertThat(holder.toString(), is("Please Select Valid Input"));
    }

 */


