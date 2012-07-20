package com.twu28.biblioteca;

import java.util.ArrayList;

public class MenuList {
    private ArrayList<Menu> menuList;
    public MenuList(ArrayList<Menu> expectedMenu) {
        menuList = expectedMenu;
    }
    public ArrayList<Menu> getMenuList() {
        return menuList;
    }
    public int getNumberOfMenu(){
        return getMenuList().size();
    }
}
