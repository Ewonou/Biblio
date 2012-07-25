package com.twu28.biblioteca;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Biblioteca {

    private Library library;
    private MenuManager menuManager;
    public String selection;
    boolean selectedItem;

    public Biblioteca(Library library, MenuManager menuManager) {
        this.library = library;

        this.menuManager = menuManager;
    }


    public void run() {
        System.out.printf("Welcome\n");
        ViewMenu go = new ViewMenu(menuManager);
        go.displayMenus();

        System.out.printf("\nPlease enter Your Selection:");

        changeUserInputTo("view");

        Scanner  scan = new Scanner(System.in);
        selection = scan.next();

        Menu menuSelected =  menuManager.stringToMenuConverter(selection);
        selectedItem = menuManager.selectAMenu(menuSelected);



     }

    private void changeUserInputTo(String menuChoice) {
        String customerMenuChoice = menuChoice;
        ByteArrayInputStream inputStream = new ByteArrayInputStream(customerMenuChoice.getBytes());
        System.setIn(inputStream);
    }

}
