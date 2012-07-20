package com.twu28.biblioteca;

import com.sun.xml.internal.stream.Entity;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    private Library library;
    private MenuList menuList;

    public Biblioteca(Library library, MenuList menuList) {
        this.library = library;
        this.menuList = menuList;
    }


    public void run() {
        System.out.printf("Welcome\n");
        ViewMenu go = new ViewMenu(menuList);
        go.displayMenus();

        System.out.printf("\nPlease Enter Your Selection:");
        //Scanner scan = new Scanner(System.in)
        //String selection = scan.next();
        //

    }


}
