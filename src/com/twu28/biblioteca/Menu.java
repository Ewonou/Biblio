package com.twu28.biblioteca;

    abstract class Menu {
    private String name;
    private Boolean selected = false;
    public Menu ( String menuName){
     name = menuName;
    }
    public String getName() {
    return name;
    }
    public void setSelected(boolean b) {
      selected = b;
    }

    public boolean checkSelection() {
            return selected;
     }
    }