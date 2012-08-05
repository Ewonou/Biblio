package com.twu28.biblioteca.businessLogic;

/**
 * Created with IntelliJ IDEA.
 * User: eaziakon
 * Date: 8/6/12
 * Time: 3:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookInfo {
    private String name;
    private String author;
    private int idNumber;
    public BookInfo(Book book){
        this.name = book.getName();
        this.author = book.getAuthor();
        this.idNumber = book.getIdNumber();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
