package com.twu28.biblioteca;
import java.util.*;
import java.io.*;
public class Biblioteca {
    private String[] menuOptions = {"Menu1","view","reserve"};
    private String menuSelect;

public void biblioteca()
{
   BookManager now = new BookManager();

   displayMessage();
   displayOptions();
   System.out.print("Please enter your selection: ");
   boolean validOption = false;
   while (validOption)
   {
   Scanner scan = new Scanner(System.in);
   menuSelect = scan.next();
   validOption = selectAnOption(menuSelect);
   }
    if (menuSelect == "view")
    {
       now.displayBooks();
    }
    if (menuSelect == "reserve")
    {
        System.out.print("Please enter the reference number of the desired book: ");
        Scanner bookNumScan = new Scanner(System.in);
        int bookNum = bookNumScan.nextInt();
        now.bookReservation(bookNum);
    }
}


    public  String displayMessage()
    {
         final String firstMsg = "Welcome";
         System.out.println(firstMsg);
        return firstMsg;
    }

    public  int displayOptions() {
        int count = 0;
        System.out.println("Please Select from the following Menu Options");
        for (String item : menuOptions){
            System.out.print(item + " ");
            count ++;
        }
        System.out.println("");
        return count;
    }

    public boolean selectAnOption(String optionSelected) {
        boolean selected = false;
        for (String elt:menuOptions)
        {
            if(optionSelected == elt)
            {
                selected = true;
                break;
            }
        }
            if (selected == false)
            {
                System.out.println("Select a valid Option");
            }
        return selected;
    }



}
