package com.twu28.biblioteca;
import java.util.*;
import java.io.*;
public class Biblioteca {
    private final static String firstMsg = "Welcome";
    private final static String[] menuOptions = {"Menu1","Menu2","Menu 3"};

public void main(String[] Args){
    System.out.println(firstMsg);
    System.out.println("Please Select from the following Menu Options");
    for (String item : menuOptions){
        System.out.print(item + " ");
    }

}
    public static String getMessage() {
        return firstMsg;
    }

    public static int getNumberOfOptions() {
        return menuOptions.length;
    }
}
