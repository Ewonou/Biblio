package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<String> userNamesArray = new ArrayList<String>();
    public HashMap<String,ArrayList<String>> ReservedBooksWithUser = new HashMap<String, ArrayList<String>>();

    public Library(ArrayList<Book> expectedBooks) {

        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void reserveBook(int idNumber, String userName) {
        int numberOfBooksChecked = 0;
        for (Book item : books) {
            numberOfBooksChecked++;
           if ( item.getIdNumber() == idNumber)
           {
               AddBookIdAndUserToReservedList(idNumber,userName);
               break;
           }
            if(numberOfBooksChecked == books.size()) {
               System.out.printf("%s", "Sorry we don't have that book yet");
           }

        }
    }

    public void AddBookIdAndUserToReservedList(int idNumber, String userName) {
        String stringIdNumber = Integer.toString(idNumber);

        ArrayList<String> userNamesPerId = ReservedBooksWithUser.get(stringIdNumber);

        boolean keyPresent = ReservedBooksWithUser.containsKey(stringIdNumber);

        if(keyPresent) {

            if (userNamesPerId == null){
                userNamesPerId = new ArrayList<String>();
            }
            userNamesPerId.add(userName);
        }
        else{
            userNamesPerId = new ArrayList<String>();
            userNamesPerId.add(userName);
            ReservedBooksWithUser.put(stringIdNumber,userNamesPerId);
        }
        System.out.printf("Thank You! Enjoy the book.");
    }
}
