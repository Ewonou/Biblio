package com.twu28.biblioteca;

import java.util.ArrayList;

public class MenuManager {
    private ArrayList<Menu> menuList;

    public MenuManager(ArrayList<Menu> expectedMenu) {
        menuList = expectedMenu;
    }
    public ArrayList<Menu> getMenuList() {
        return menuList;
    }
    public int getNumberOfMenu(){
        return getMenuList().size();
    }

    public boolean selectAMenu(Menu selection) {
        boolean menuFound = false;
     for (Menu item: menuList) {
         boolean compareMenus = selection.equals(item);

        if ( compareMenus){
            item.setSelected(true);
            menuFound = true;
            break;
           }
      }
      return menuFound;
    }
    public Menu stringToMenuConverter(String menuName){
        Menu menu = new Menu(menuName);
        return menu;
    }
}
