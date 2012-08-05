package com.twu28.biblioteca.userInterface;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: eaziakon
 * Date: 8/6/12
 * Time: 2:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {

    ArrayList<MenuOption> expectedMenu;
    @Before
    public void setupMenuList(){
        ShowBooks showBook = new ShowBooks("Display Books");
        MenuOption reserveBook = new ReserveBook("Reserve A Book");
        expectedMenu = new ArrayList<MenuOption>();
        MenuView view = new MenuView() ;
        expectedMenu.add(showBook);
        expectedMenu.add(reserveBook);
    }
    @Test
    public void ShouldDisplayMenuName()
    {
        setupMenuList();
        MenuView view = new MenuView() ;
        Menu go = new Menu(expectedMenu,view);
        ArrayList<String> result= go.getMenuNames();
        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("1 Display Books");
        expectedResult.add("2 Reserve A Book");
        assertEquals(expectedResult,result);
    }
    @Test
    public void ShouldSelectMenu(){
        setupMenuList();
        MenuView mock = mock(MenuView.class);
        when(mock.getCustomerIntegerInput()).thenReturn(1);

        Menu go = new Menu(expectedMenu, mock);
        go.markingAMenuSelected(mock.getCustomerIntegerInput());
        assertEquals(true, expectedMenu.get(0).checkSelection());
    }

    @Test
    public void ShouldBeNotifiedWithSelectAValidOption(){
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        setupMenuList();
        MenuView display = new MenuView();

        Menu go = new Menu(expectedMenu,display);
        assertFalse(go.markingAMenuSelected(4));
        assertEquals("Select a valid Option!!",outStream.toString());
    }
}

