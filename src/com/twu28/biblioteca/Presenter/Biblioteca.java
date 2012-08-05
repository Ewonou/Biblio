package com.twu28.biblioteca.Presenter;

public class Biblioteca {

    public Biblioteca (){
    }

    public void run(){
        BibliotecaView view = new BibliotecaView();
        view.displayWelcome();
        view.msgBeforeMenuDisplay();

    }
}












