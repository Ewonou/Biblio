package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ViewMenuTest {

    @Test
    public void ShouldDisplayMenuItems(){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(stream);
        System.setOut(outputStream);

        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu("See"));
        MenuList menuList = new MenuList(menus);

        ViewMenu seeLight =  new ViewMenu(menuList);

        seeLight.displayMenus();

         assertEquals(stream.toString(), "See ");

    }

    //@Test
    //public void ShouldShowNumberOfCharacter(){
      //  ArrayList<Menu> menus = new ArrayList<Menu>();
        //menus.add(new Menu("See"));
        //MenuList menuList = new MenuList(menus);
        //ViewMenu furtherLight = new ViewMenu(menuList);

        //assertEquals(furtherLight.getMenuItemCharacterOccupancy(), 4);


   // }
}
