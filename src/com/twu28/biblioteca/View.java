package com.twu28.biblioteca;


import java.io.ByteArrayOutputStream;

public class View {

ByteArrayOutputStream object = new ByteArrayOutputStream();
private String toDisplay;

public View(String toBeDisplayed){
toDisplay = toBeDisplayed;
}

public void display( ){

for (int i = 0; i < toDisplay.length(); i++){
object.write(toDisplay.charAt(i));
}
System.out.println(toDisplay);
}
}

