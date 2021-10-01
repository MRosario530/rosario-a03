/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */

package baseline;

public class Solution31 {
    public static void main(String[] args){
        // Create an int named age and call getUserInput("Please enter your age: ")
        // create an int named restingHeartRate and call getUserInput("Please enter your resting heart rate: ")

    }

    public int getUserInput(String prompt){
        // Create a variable responsible for maintaining the loop
        // Display the prompt
        // Attempt to read in an int using a try/catch and a loop
        // Have a print statement within the catch for not a valid input
        // Have an extra statement to not allow 0 or less as an input
        // Loop the previous statements until the user enters a valid int
        // Return the user int
    }

    private int calculateTargetHeartRate(int age, int restingHeartRate, double intensity){
        // Returns (((220 − age) − restingHeartRate) × intensity) + restingHeartRage rounded up
    }

    public String displayHeartRateTable(int age, int restingHeartRate){
        // Start the string wtih the restingHearRate and age above the table
        // Add to the string the labels "Intensity" and Rate
        // Create a for loop which starts at 55 and increments by 5 to 95
            // Call calculateTargetHeartRate(age, restingHeartRate, loop#/100) and add the percent (loop value) and
            // targetHeartRate to the string
        // Return the string
    }
}
