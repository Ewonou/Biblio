package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookManager {

    public int displayBooks()
    {
        int bookDisplayed = 0;
        try
        {
            File bookAuthor = new File("booksAndAuthors.txt");

            FileReader bookReader = new FileReader(bookAuthor);

            BufferedReader reader = new BufferedReader(bookReader);

            String line = null ;

            while ((line = reader.readLine())!= null)
            {
                System.out.println(line);
                bookDisplayed++;
            }
            reader.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return bookDisplayed;
    }
}
