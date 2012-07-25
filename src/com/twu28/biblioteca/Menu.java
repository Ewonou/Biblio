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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        if (name != null ? !name.equals(menu.name) : menu.name != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
