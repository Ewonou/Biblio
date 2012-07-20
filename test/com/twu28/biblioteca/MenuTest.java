package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MenuTest {
    @Test
    public void shouldPopulateMenuName(){
        Menu menu = new Menu("show");

        assertEquals("show",menu.getName());
    }
}
