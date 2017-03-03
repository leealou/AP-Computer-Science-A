// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ****************************************************************
package squaretest;
import java.util.Scanner;

public class Square {

    int[][] square;
    int numSum = 0, newNum = 0, new2num = 0;
    int numSum2 = 0;
    int total = 0;
    int total2 = 0;

    public Square(int size) 
    {
        square = new int[size][size];
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row) 
    {
        numSum = 0;
        for (int count = 0; count < square.length; count++) 
        {
            numSum += square[row][count];
        }

        return numSum;
    }
   //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col) 
    {
        int numSum2 = 0;
        for (int index = 0; index < square.length; index++) 
        {
            numSum2 += square[index][col];
        }
        return numSum2;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        for (int nrow = 0; nrow < square.length; nrow++)
        {
            total += square[nrow][nrow];
        }
    return total;
    }


    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        for (int nrow = 0; nrow < square.length; nrow++)
        {
            total2 += square[nrow][(square.length-1) - nrow];
        }
    return total2;

 }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        if (numSum == numSum2 && numSum == total && numSum == total2)
        { 
            return true; 
        } 
        else 
        { 
            return false;
        }
    }

    //--------------------------------------
    //read info into the square from the input stream associated with the
    //Scanner parameter
    //--------------------------------------

    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
        {   
            for (int col = 0; col < square.length; col ++)
        {
            square[row][col] = scan.nextInt();
        }
    } 
}

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for (int row = 0; row < square.length; row++) 
        { 
            for(int col=0; col < square[row].length; col++) 
            { 
                System.out.print(square[row][col] + " \t");
            }
            System.out.println();
        }
    }
}


