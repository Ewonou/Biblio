package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MenuTest {
    @Test
    public void ShouldReturnName(){
        Menu view = new MenuOption("view");
       assertEquals("view",view.getName());
    }
    @Test
    public void ShouldSelectMenu(){
        Menu view = new MenuOption("view");
        view.setSelected(true);
        assertEquals(view.checkSelection(),true);
    }

}
