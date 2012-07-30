package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class MenuManagerTest {


}


/*
@Test

public void ShouldReturnAllMenuInTheMenuList() {
  ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
  expectedMenu.add(new Menu ("Show"));

 MenuManager menuManager = new MenuManager(expectedMenu);
 ArrayList<Menu> menuOptions = menuManager.getMenuList();
 assertEquals(menuOptions,expectedMenu);
}
 @Test
  public void ShouldSelectAMenuItem(){
     ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
     expectedMenu.add(new Menu ("Show"));
     expectedMenu.add(new Menu("View"));

     Menu selection = new Menu("Show");
     MenuManager menuManager = new MenuManager(expectedMenu);
     menuManager.selectAMenu(selection);

     assertTrue(expectedMenu.get(0).selected);
 }

    @Test
    public void ShouldConvertToMenu(){
        ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
        expectedMenu.add(new Menu ("Show"));
        expectedMenu.add(new Menu("View"));
        MenuManager menuManager = new MenuManager(expectedMenu);

        assertTrue(menuManager.stringToMenuConverter("View").equals(new Menu("View")));

    }

    @Test
    public void ShouldReturnFalseIfInvalidMenuEntered()
    {

    }
*/