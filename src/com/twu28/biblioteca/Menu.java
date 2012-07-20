package com.twu28.biblioteca;

public class Menu {
    String name;
    public Menu ( String menuName){
     name = menuName;
    }
    public String getName() {
        return name;
    }
    public int getCharCount(){
    return name.length();
    }

}
