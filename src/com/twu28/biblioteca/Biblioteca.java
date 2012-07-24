package com.twu28.biblioteca;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
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

        changeUserInputToView("view");

        Scanner  scan = new Scanner(System.in);
        selection = scan.next();

        Menu menuSelected =  menuManager.stringToMenuConverter(selection);
        selectedItem = menuManager.selectAMenu(menuSelected);

        if (selectedItem){}

        else {

            System.out.printf("\nPlease Select Valid Input");

    }
    }

    private void changeUserInputToView(String menuChoice) {
        String customerMenuChoice = menuChoice;
        ByteArrayInputStream inputStream = new ByteArrayInputStream(customerMenuChoice.getBytes());
        System.setIn(inputStream);
    }

}
