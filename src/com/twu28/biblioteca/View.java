package com.twu28.biblioteca;


import java.io.ByteArrayOutputStream;

public class View {

ByteArrayOutputStream systemData;
private String toDisplay;


public View(String toBeDisplayed){
toDisplay = toBeDisplayed;
}

public void display( ){

systemData = new ByteArrayOutputStream();

for (int i = 0; i < toDisplay.length(); i++){
systemData.write(toDisplay.charAt(i));
}
System.out.println(systemData);
}
}

