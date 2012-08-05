package com.twu28.biblioteca.userInterface;

import java.util.ArrayList;

  public class Menu {
    private MenuView view = new MenuView();
    private ArrayList<MenuOption> menuList;
    private ArrayList<String> menuInfo = new ArrayList<String>();
    public Menu(ArrayList<MenuOption> expectedMenu, MenuView view) {
        menuList = expectedMenu;
        this.view = view;
    }
     public ArrayList<String> getMenuNames(){
         int count = 1;
         for (MenuOption item: menuList) {
             menuInfo.add( count + " " + item.getName());
             count++;
         }
         return menuInfo;
     }
     public void showMenuNames(){
         view.displayMenuNames(menuInfo);
     }

      public boolean markingAMenuSelected(int customerSelection){
        boolean foundMenu = false;
           if(customerSelection <= menuList.size()){
             foundMenu = true;
             menuList.get(customerSelection - 1).setSelected(true);
           }
            else{
             view.notifyUserToSelectValidOption();
           }
          return foundMenu;
     }
}
