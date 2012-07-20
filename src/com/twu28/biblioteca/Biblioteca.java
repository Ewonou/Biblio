package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Tanuj Mathur
 * Date: 7/18/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    private Library library;
    private MenuManager menuManager;

    public Biblioteca(Library library, MenuManager menuManager) {
        this.library = library;
        this.menuManager = menuManager;
    }


    public void run() {
        System.out.printf("Welcome\n");
        ViewMenu go = new ViewMenu(menuManager);
        go.displayMenus();

        System.out.printf("\nPlease Enter Your Selection:");
        //Scanner scan = new Scanner(System.in)
        //String selection = scan.next();
        //

    }


}
