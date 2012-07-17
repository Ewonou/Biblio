package com.twu28.biblioteca;
import java.util.*;
import java.io.*;
public class Biblioteca {
    private String[] menuOptions = {"Menu1","Menu2","Menu 3"};
    private static String menuSelect;

public void Biblio()
{

   displayMessage();
   displayOptions();
   System.out.print("Please enter your selection :");
   Scanner scan = new Scanner(System.in);
   menuSelect = scan.next();
    selectAnOption(menuSelect);

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
        return selected;
    }
}
