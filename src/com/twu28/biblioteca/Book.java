package com.twu28.biblioteca;

public class Book {
String name;
String author;
int quantity;

public void viewBook(){
View go = new View(name + " By " +author);
go.display();
}

public int getQuantity(){
return quantity;
}

}

