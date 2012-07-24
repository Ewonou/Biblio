package com.twu28.biblioteca;

import java.util.ArrayList;

public class ViewLibrary {
    Library library;
    public ViewLibrary(Library library) {
        this.library = library;
    }

    public void display() {
       ArrayList<Book> books = library.getAllBooks();
      for(Book i:books)  {
     System.out.printf("%s By %s", i.getName(), i.getAuthor());
    }
}
}