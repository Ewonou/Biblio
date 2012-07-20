package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Merveille & Rejoice
 * Date: 7/19/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewMenu  {
    MenuList menuList;
    int charCountOfMenuItems = 0;

public ViewMenu(MenuList menuList){
    this.menuList = menuList;
}

    public void displayMenus() {
      ArrayList<Menu> currentMenu = menuList.getMenuList();
      for (Menu item: currentMenu)
      {

          System.out.printf("%s ",item.getName());
         charCountOfMenuItems = charCountOfMenuItems + item.getCharCount()+ 1;
      }
    }

    public int getMenuItemCharacterOccupancy(){
        return charCountOfMenuItems;
    }
}
