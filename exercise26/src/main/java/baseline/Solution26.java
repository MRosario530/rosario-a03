/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution26 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution26 app = new Solution26();
        // Store a double for balance from the user using promptForValue(prompt)
        double balance = app.promptForValue("What is your balance? ");
        // Store a double for APR from the user using promptForValue(prompt), prompt must specify PERCENTAGE.
        double apr = app.promptForValue("What is the APR on the card (as a percent)? ");
        // Store a double for monthlyPayment from the user using promptForValue(prompt)
        double monthlyPayment = app.promptForValue("What is the monthly payment you can make? ");
        // Create a PaymentCalculator object using the values above
        PaymentCalculator calc = new PaymentCalculator(balance, apr, monthlyPayment);
        // Calculate the number of months using the calculateMonthsUntilPaidOff() method from PaymentCalculator
        // Print out a statement stating how many months it will take to pay off the card
        System.out.println("It will take you " + calc.calculateMonthsUntilPaidOff() + " months to pay off this card.");
    }

    public double promptForValue(String prompt){
        double result = 0;
        boolean invalidDouble = true;
        // Prompt the user for a value using the 'prompt' string
        // Ensure the user can only enter positive numbers through error checking and a loop
        do {
            invalidDouble = false;
            try {
                do {
                    System.out.print(prompt);
                    result = input.nextDouble();
                }while(result <= 0);
            } catch(InputMismatchException e) {
                invalidDouble = true;
                input.nextLine();
            }
        } while (invalidDouble);
        // Return the user given value
        return result;
    }
}
