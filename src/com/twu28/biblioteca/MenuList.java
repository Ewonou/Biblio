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

    public void selectAMenu(Menu selection) {
     for (Menu item: menuList) {
        if ( item.equals(selection)){
            item.setSelected(true);
     }
    }
    }
    public Menu stringToMenuConverter(String menuName){
        Menu menu = new Menu(menuName);
        return menu;
    }
}
