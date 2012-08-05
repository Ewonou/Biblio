package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuManagerTest {

    ArrayList<Menu> expectedMenu;
    @Before
    public void setupMenuList(){
        MenuOption showBook = new MenuOption("Display Books");
        MenuOption reserveBook = new MenuOption("Reserve A Book");
        expectedMenu = new ArrayList<Menu>();
        MenuManagerView view = new MenuManagerView() ;
        expectedMenu.add(showBook);
        expectedMenu.add(reserveBook);
    }
    @Test
    public void ShouldDisplayMenuName()
   {
    setupMenuList();
    MenuManagerView view = new MenuManagerView() ;
    MenuManager go = new MenuManager(expectedMenu,view);
    ArrayList<String> result= go.getMenuNames();
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("1 Display Books");
    expectedResult.add("2 Reserve A Book");
    assertEquals(expectedResult,result);
}
     @Test
    public void ShouldSelectMenu(){
    setupMenuList();
    MenuManagerView mockManager = mock(MenuManagerView.class);
    when(mockManager.getCustomerIntegerInput()).thenReturn(1);

    MenuManager go = new MenuManager(expectedMenu,mockManager);
    go.markingAMenuSelected(mockManager.getCustomerIntegerInput());
    assertEquals(true, expectedMenu.get(0).checkSelection());
     }

    @Test
    public void ShouldBeNotifiedWithSelectAValidOption(){
     ByteArrayOutputStream outStream = new ByteArrayOutputStream();
     PrintStream printStream = new PrintStream(outStream);
     System.setOut(printStream);
     setupMenuList();
     MenuManagerView display = new MenuManagerView();

     MenuManager go = new MenuManager(expectedMenu,display);
     assertFalse(go.markingAMenuSelected(4));
     assertEquals("Select a valid Option!!",outStream.toString());
    }
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