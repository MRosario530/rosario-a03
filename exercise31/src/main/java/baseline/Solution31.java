/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */

package baseline;

import java.util.Formatter;
import java.util.Scanner;

public class Solution31 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution31 app = new Solution31();
        // Create an int named age and call getUserInput("Please enter your age: ")
        int age = app.getUserInput("Please enter your age: ");
        // Create an int named restingHeartRate and call getUserInput("Please enter your resting heart rate: ")
        int restingHeartRate = app.getUserInput("Please enter your resting heart rate: ");
        // Call createHeartRateTable(age, restingHeartRate) and print the outputted string
        System.out.print(app.createHeartRateTable(age,restingHeartRate));
    }

    public int getUserInput(String prompt){
        int result = 0;
        // Create a variable responsible for maintaining the loop
        boolean invalidint;
        do {
            invalidint = false;
            try {
                // Display the prompt
                System.out.print(prompt);
                // Attempt to read in an int using a try/catch and a loop
                String userInput = input.nextLine();
                result = Integer.parseInt(userInput);
                // Have an extra statement to not allow 0 or less as an input
                if (result <= 0) {
                    System.out.println("Enter a valid number above 0! ");
                    invalidint = true;
                }
            } catch(NumberFormatException e) {
                System.out.println("Enter a valid number above 0! ");
                // Loop the previous statements until the user enters a valid int
                invalidint = true;
            }
            // Loop until the user enters a valid int
        } while (invalidint);
        // Returns the result
        return result;
    }

    public StringBuilder createHeartRateTable(int age, int restingHeartRate){
        // Add to the string the labels "Intensity" and Rate
        // Create a for loop which starts at 55 and increments by 5 to 95
            // Call calculateTargetHeartRate(age, restingHeartRate, loop#/100) and add the percent (loop value) and
            // targetHeartRate to the string
        // Return the string
        StringBuilder heartRateTable = new StringBuilder();
        Formatter formatter = new Formatter(heartRateTable);
        // Start the string with the restingHearRate and age above the table
        heartRateTable.append("Resting Pulse: ").append(restingHeartRate).append("        Age: ").append(age)
                .append("\r\n\r\n");
        // Add to the string the labels "Intensity" and Rate
        heartRateTable.append("Intensity    | Rate\r\n").append("-------------|--------\r\n");
        for (int i = 55; i < 100; i = i + 5) {
            String currentPercent = i + "%";
            formatter.format("%-13s|", currentPercent);
            formatter.format(" %d bpm",calculateTargetHeartRate(age, restingHeartRate, i/100.0));
            heartRateTable.append("\r\n");
        }
        // Close the formatter
        formatter.close();
        return heartRateTable;
    }

    private int calculateTargetHeartRate(int age, int restingHeartRate, double intensity){
        // Returns (((220 − age) − restingHeartRate) * intensity) + restingHeartRate rounded up
        double targetHeartRate = (((220 - age) - restingHeartRate) * intensity) + restingHeartRate;
        return (int)Math.round(targetHeartRate);
    }

}
