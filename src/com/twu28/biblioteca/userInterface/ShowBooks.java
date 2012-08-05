package com.twu28.biblioteca.userInterface;

import com.twu28.biblioteca.businessLogic.Book;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: eaziakon
 * Date: 8/6/12
 * Time: 2:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShowBooks extends MenuOption{
    public ShowBooks(String menuName) {
        super(menuName);
    }
    /*public void run(){
        int count = 0;
        ArrayList<Book> books = library.getAllBooks();
        for(Book i:books)  {
            count++;
            System.out.printf("%s By %s, ID# %s\n", i.getName(), i.getAuthor(), i.getIdNumber());
        }
        return count;
    }   */
}
