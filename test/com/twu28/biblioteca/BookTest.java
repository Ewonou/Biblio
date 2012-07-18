package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

public class BookTest {
@Test
    public void displayBook(){

    ArrayList<String> nameInfo = new ArrayList<String>();
    nameInfo.add("Head First");
    ArrayList<String> authorInfo = new ArrayList<String>();
    authorInfo.add("Elisabeth Freeman");

    Book sut = new Book();

    sut.name = nameInfo.get(0);
    sut.author = authorInfo.get(0);

    StringBuffer result = new StringBuffer();
    result.append(sut.bookInfo);

    StringBuffer expectedOutput = new StringBuffer();
    expectedOutput.append("Head First By Elisabeth Freeman");

}
}
