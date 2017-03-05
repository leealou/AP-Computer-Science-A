//******************************************************************************
// File: SquareTest.java
//
// Description: Uses the Square class to read in square data and 
// tell if each square is magic.
//
// Author: *** Alexis Lee ***
//******************************************************************************
package squaretest;
import java.util.Scanner;
import java.io.*;

public class SquareTest {

    //--------------------------------------------------------------------------
    // Create square objects from text files and print if they are magic.
    //--------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        boolean bool = true;
        Square square; // current square
	String filename = "magicsquaredata"; // file name entered by user
	File squareFile; // file entered by user
	Scanner scan = new Scanner(System.in); // scanner for user input
        
        // Prompt user for file name and print result.
	while (!filename.equals("q")) 
        {
	    System.out.print("Enter square file name (q to quit): ");
	    filename = scan.next();
	    squareFile = new File("magicsquaredata.txt");

	    if (squareFile.exists()) {
		square = new Square(squareFile);

	        if (bool == true) 
                {
                    System.out.println("This is a Magic Square.");
                    int magNum = numSum + numSum2 + total + total2;
                    System.out.println("Its magic number is: " + magNum);
                } 
                else //if (bool == false) 
                {
                    System.out.println("This is not a Magic Square.");
                }
		
	    } else if (!filename.equals("q")) {
		System.out.println("File \"" + filename + 
				   "\" does not exist\n");
	    }
	}

    } 
