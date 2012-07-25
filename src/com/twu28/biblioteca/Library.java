package com.twu28.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> expectedBooks) {

        this.books = expectedBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public boolean selectBook(String chosenBookName, String chosenBookAuthor){
        ArrayList<Book> tempBooksWithSameName = new ArrayList<Book>();
        boolean selectedABook = false;
        for (Book item:books){
           if (item.getName()== chosenBookName){
               tempBooksWithSameName.add(item);
           }
        }
        switch (tempBooksWithSameName.size()){
        case 0: selectedABook = false; 
            break;

        case 1: tempBooksWithSameName.get(0).setReserved();
              selectedABook = true; 
            break;
        
            default: for (Book item: tempBooksWithSameName){
                if(item.getAuthor() == chosenBookAuthor){
                    item.setReserved();
                    selectedABook = true;
               
                }
                selectedABook = false;
            }

        }
        return selectedABook;
    }
}
