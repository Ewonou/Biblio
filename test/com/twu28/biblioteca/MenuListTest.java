package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class MenuListTest {

@Test

public void ShouldReturnAllMenuInTheMenuList() {
  ArrayList<Menu> expectedMenu = new ArrayList<Menu>();
  expectedMenu.add(new Menu ("Show"));

 MenuList menuList = new MenuList(expectedMenu);
 ArrayList<Menu> menuOptions = menuList.getMenuList();
 assertEquals(menuOptions,expectedMenu);
}
}
