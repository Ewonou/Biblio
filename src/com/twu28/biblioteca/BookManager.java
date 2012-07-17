package com.twu28.biblioteca;

import java.io.*;

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

    public boolean bookReservation(int bookReference) {
        boolean foundBook = false;
        boolean reserveSuccess = false;
        try
        {
            File bookAuthor =  new File("booksAndAuthors.txt");
            FileReader bookReader = new FileReader(bookAuthor);
            BufferedReader reader = new BufferedReader(bookReader);
            BufferedWriter writer = new BufferedWriter(new FileWriter("reservedBooks.txt"));
            String line = null ;
            while ((line = reader.readLine())!= null)
            {
                String[] lineSegments = line.split("/");
                int systemBookNumber = Integer.parseInt(lineSegments[0]);
                if (systemBookNumber == bookReference)
                {
                    foundBook = true;
                    break;
                }
            }
            if (foundBook)
            {
                writer.write(bookReference);
                reserveSuccess = true;
            }
        }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return reserveSuccess;
    }

    public boolean successfulReserved(int bookReference) {
        boolean successMsg = false;
        try
        {
            FileReader reserveChecker = new FileReader("reservedBooks.txt");
            BufferedReader reader = new BufferedReader(reserveChecker);
            String line = null ;
            while ((line = reader.readLine())!= null)
            {
                int systemBookNumber = Integer.parseInt(line);
                if (systemBookNumber == bookReference)
                {
                    System.out.println("Thank You! Enjoy the book.");
                    successMsg = true;
                    break;
                }
            }
        }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return successMsg;
    }
}
