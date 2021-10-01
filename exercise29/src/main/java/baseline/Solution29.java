/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution29 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution29 app = new Solution29();
        // Create a double rateOfReturn and call getUserDouble()
        double rateOfReturn = app.getUserDouble();
        // call calculateDoubleInvestment(rateOfReturn) and print the result
        String output = "It will take " + app.calculateDoubleInvestment(rateOfReturn);
        output += " years to double your initial investment.\n";
        System.out.println(output);
    }

    public double getUserDouble(){
        double result = 0;
        // Create a variable responsible for maintaining the loop
        boolean invalidDouble;
        do {
            invalidDouble = false;
            try {
                // Prompt the user to enter a number
                System.out.print("What is the rate of return? ");
                // Attempt to read in a double using a try/catch and a loop
                String userInput = input.nextLine();
                result = Double.parseDouble(userInput);
                // Have an extra statement to not allow 0 as an input
                if (result <= 0) {
                    System.out.println("Sorry. That's not a valid input");
                    invalidDouble = true;
                }
            } catch(NumberFormatException e) {
                // Have a print statement within the catch for not a valid input
                System.out.println("Sorry. That's not a valid input.");
                // Setting invalidDouble back to true redoes the loop and prompts the user again for a double
                invalidDouble = true;
            }
            // Loop until the user enters a valid double
        } while (invalidDouble);
        // Returns the result
        return result;
    }

    public int calculateDoubleInvestment(double rateOfReturn){
        // Return 72.0/rateOfReturn rounded up to the next whole number
        return (int)Math.ceil(72.0/rateOfReturn);
    }
}
