package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MenuTest {
    @Test
    public void shouldPopulateMenuName(){
        Menu menu = new Menu("show");

        assertEquals("show",menu.getName());
    }

    @Test
    public void shouldSetSelectedAndGetSelected(){
        Menu menu = new Menu("View");
        menu.setSelected(true);

        assertTrue(true == menu.selected);
        assertTrue(true == menu.getSelected());

    }
    @Test
    public void ShouldVerifyEquality(){

        assertTrue(new Menu("open").equals(new Menu("open")));
        assertFalse(new Menu("open").equals(new Menu("opne")));
    }

}
