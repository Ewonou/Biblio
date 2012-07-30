package com.twu28.biblioteca;


import java.util.Scanner;

public class BibliotecaView {
    void displayWelcome(){
    System.out.printf("Welcome");
    }
    public void msgBeforeMenuDisplay(){
        System.out.printf("Please Select among the following menus");
    }
    public String menuSelectionCapture(){
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}





