package com.twu28.biblioteca;

import java.util.ArrayList;

public class LibraryView {
    Library library;
    public LibraryView(Library library) {
        this.library = library;
    }

    public int displayAllBooks() {
     int count = 0;
       ArrayList<Book> books = library.getAllBooks();
      for(Book i:books)  {
       count++;
     System.out.printf("%s By %s, ID# %s\n", i.getName(), i.getAuthor(), i.getIdNumber());
    }
        return count;
}
    public void informOfAbsenceOfBook(){
        System.out.printf("%s", "Sorry we don't have that book yet\n");
    }

    public void thanksUser(){
        System.out.printf("Thank You! Enjoy the book.\n");
    }
}