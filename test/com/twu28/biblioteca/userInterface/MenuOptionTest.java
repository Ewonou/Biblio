package com.twu28.biblioteca.userInterface;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MenuOptionTest {
    @Test
    public void ShouldReturnName(){
        ReserveBook view = new ReserveBook("view");
       assertEquals("view",view.getName());
    }
    @Test
    public void ShouldSelectMenu(){
        ShowBooks view = new ShowBooks("view");
        view.setSelected(true);
        assertEquals(view.checkSelection(),true);
    }

}
