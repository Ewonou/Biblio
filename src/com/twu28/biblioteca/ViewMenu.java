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
    MenuManager menuManager;
    int charCountOfMenuItems = 0;

public ViewMenu(MenuManager menuManager){
    this.menuManager = menuManager;
}

    public void displayMenus() {
      ArrayList<Menu> currentMenu = menuManager.getMenuList();
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
