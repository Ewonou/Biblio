package com.twu28.biblioteca.userInterface;

    abstract class MenuOption {
    private String name;
    private Boolean selected = false;
    public MenuOption(String menuName){
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