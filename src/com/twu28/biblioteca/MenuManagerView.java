package com.twu28.biblioteca;

import com.sun.xml.internal.stream.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManagerView {
    public void displayMenuNames(ArrayList<String> menuNames){
       for (String menuName: menuNames ) {
              System.out.printf(menuName + " ");
       }
    }
   public int getCustomerIntegerInput(){
       Scanner sc = new Scanner(System.in);
       return sc.nextInt() ;
   }
    public void notifyUserToSelectValidOption(){
        System.out.printf("Select a valid Option!!") ;
    }
}
