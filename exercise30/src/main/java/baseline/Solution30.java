/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Formatter;

public class Solution30 {
    public static void main(String[] args) {
        Solution30 app = new Solution30();
        // Create a 2d integer array called multTable and call calculateMultiplicationTable()
        int[][] multTable = app.calculateMultiplicationTable();
        // Call printMultiplicationTable(multTable) to print the table
        app.printMultiplicationTable(multTable);
    }

    public int[][] calculateMultiplicationTable(){
        // Create a 2d array of integers of length and width 12
        int[][] multTable = new int[12][12];
        // Create a double for loop, multiplying each value from 1-12 with each other
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++){
                // Place the value in the correct location of the array
                multTable[i][j] = (i+1) * (j+1);
            }
        }
        // Return the array
        return multTable;
    }

    public void printMultiplicationTable(int[][] multiplicationTable){
        // Create a formatter object and have the output be right shifted
        StringBuilder multTableText = new StringBuilder();
        Formatter formatter = new Formatter(multTableText);
        // Create a double for loop, formatting every value and adding it to the string
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++){
                formatter.format("%4d",multiplicationTable[i][j]);
            }
            // Ensure there is a new line character after every 12 characters.
            multTableText.append("\n");
        }
        // Close the formatter
        formatter.close();
        // Return the string
        System.out.print(multTableText);
    }
}
