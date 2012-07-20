package com.twu28.biblioteca;

public class Menu {
    String name;
    Boolean selected = false;
    public Menu ( String menuName){
     name = menuName;
    }
    public String getName() {
        return name;
    }
    public int getCharCount(){
    return name.length();
    }
    public void setSelected(Boolean selected){
       this.selected = selected;
    }
    public Boolean getSelected(){
        return selected;
    }

    public boolean equals (Object object){
     Menu menu = (Menu) object;
     return name == menu.name;
    }

}
