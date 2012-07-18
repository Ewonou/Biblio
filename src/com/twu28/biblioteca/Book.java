package com.twu28.biblioteca;

import java.io.ByteArrayOutputStream;

public class Book {
String name;
String author;
int quantity;
String outputInfo;
ByteArrayOutputStream bookInfo;

public void viewBook(){
outputInfo =  name + " By " +author;
View go = new View(outputInfo);
ByteArrayOutputStream bookInfo = new ByteArrayOutputStream();

for (int i = 0; i < outputInfo.length(); i++){
bookInfo.write(outputInfo.charAt(i));
}

go.display();
}

public int getQuantity(){
return quantity;
}

}

