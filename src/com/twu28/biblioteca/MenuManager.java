package com.twu28.biblioteca;

import java.util.ArrayList;

  public class MenuManager {
    private MenuManagerView view = new MenuManagerView();
    private ArrayList<Menu> menuList;
    private ArrayList<String> menuInfo = new ArrayList<String>();
    public MenuManager(ArrayList<Menu> expectedMenu,MenuManagerView view) {
        menuList = expectedMenu;
        this.view = view;
    }
     public ArrayList<String> getMenuNames(){
         int count = 1;
         for (Menu item: menuList) {
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
