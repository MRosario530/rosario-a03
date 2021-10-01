/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution28 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.###");
        Solution28 app = new Solution28();
        // Create a double array userValues and call getUserDoublesArray() to fill it
        double[] userValues =  app.getUserDoublesArray();
        // Create a double total and call addFiveNumbers(userValues) to find the total
        double total = app.addFiveNumbers(userValues);
        // Print the result from total
        System.out.println("The total is " + df.format(total) + ".");
    }

    public double addFiveNumbers(double[] values){
        // Create a double value to contain a total
        double total = 0;
        // Create a loop to run 5 times, adding each value in the array to the total
        for (int i = 0; i < 5; i++){
            total += values[i];
        }
        // Return the total
        return total;
    }

    public double[] getUserDoublesArray(){
        // Create a double array of size 5
        double[] userValues = new double[5];
        // Scan user input into the array 5 times
        for (int i = 0; i < 5; i++){
            userValues[i] = getUserDouble();
        }
        // Return the array
        return userValues;
    }

    private double getUserDouble(){
        double result = 0;
        // Create a variable responsible for maintaining the loop
        boolean invalidDouble = true;
        do {
            invalidDouble = false;
            try {
                // Prompt the user to enter a number
                System.out.print("Enter a number: ");
                // Attempt to read in a double using a try/catch and a loop
                result = input.nextDouble();
            } catch(InputMismatchException e) {
                // Setting invalidDouble back to true redoes the loop and prompts the user again for a double
                invalidDouble = true;
                input.nextLine();
            }
        } while(invalidDouble);
        // Returns the result
        return result;
    }
}
