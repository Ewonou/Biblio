package com.twu28.biblioteca.businessLogic;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<String> userNamesArray = new ArrayList<String>();
    private HashMap<String,ArrayList<String>> reservedBooksWithUser = new HashMap<String, ArrayList<String>>();
    private LibraryView myView = new LibraryView(this);
    public Library(ArrayList<Book> expectedBooks) {
        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
    public int numberOfBooks(){
        return books.size();
    }

    public void reserveBook(int idNumber, String userName) {
        int numberOfBooksChecked = 0;
        for (Book item : books) {
            numberOfBooksChecked++;
            if ( item.getIdNumber() == idNumber)
            {
                AddBookIdAndUserToReservedList(idNumber,userName);
                myView.thanksUser();
                break;
            }
            if(numberOfBooksChecked == books.size()) {
                myView.informOfAbsenceOfBook();
            }
        }
    }

    public void AddBookIdAndUserToReservedList(int idNumber, String userName) {
        String stringIdNumber = Integer.toString(idNumber);
        ArrayList<String> userNamesPerId = reservedBooksWithUser.get(stringIdNumber);
        boolean keyPresent = reservedBooksWithUser.containsKey(stringIdNumber);
        if(keyPresent) {
            if (userNamesPerId == null){
                userNamesPerId = new ArrayList<String>();
            }
            userNamesPerId.add(userName);
        }
        else{
            userNamesPerId = new ArrayList<String>();
            userNamesPerId.add(userName);
            reservedBooksWithUser.put(stringIdNumber,userNamesPerId);
        }
    }
    public HashMap<String,ArrayList<String>> getBookReservation(){
        return reservedBooksWithUser;
    }
}
