package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class MenuListTest {

@Test

public void ShouldReturnAllMenuInTheMenuList() {
  ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
  expectedMenu.add(new Menu ("Show"));

 MenuList menuList = new MenuList(expectedMenu);
 ArrayList<Menu> menuOptions = menuList.getMenuList();
 assertEquals(menuOptions,expectedMenu);
}
 @Test
  public void ShouldSelectAMenuItem(){
     ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
     expectedMenu.add(new Menu ("Show"));
     expectedMenu.add(new Menu("View"));

     Menu selection = new Menu("Show");
     MenuList menuList = new MenuList(expectedMenu);
     menuList.selectAMenu(selection);

     assertTrue(expectedMenu.get(0).selected);

 }
    @Test
    public void ShouldConvertToMenu(){
        ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
        expectedMenu.add(new Menu ("Show"));
        expectedMenu.add(new Menu("View"));
        MenuList menuList = new MenuList(expectedMenu);

        assertTrue(menuList.stringToMenuConverter("View").equals(new Menu("View")));

    }
}
