package com.twu28.biblioteca.Presenter;


import java.util.Scanner;

public class BibliotecaView {
    void displayWelcome(){
    System.out.printf("Welcome");
    }
    public void msgBeforeMenuDisplay(){
        System.out.printf("Please Enter the number corresponding to your desired MenuOption");
    }

    public String menuSelectionCapture(){
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}





