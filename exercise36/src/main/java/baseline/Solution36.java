/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution36 {
    public static void main (String[] args){
        // Create an arraylist called responseTimeList and call getResponseTimes()
        // Create an array called statisticValues with 4 positions, each representing average, max, min, and standard
            // deviation respectively
            // Call calculateStatistics(responseTimeList) and have it return an array to statisticValues
        // Print a string created by the method createStatisticsString(statisticValues)
    }

    public ArrayList<Integer> getResponseTimes() {
        // Create a variable responsible for telling the loop when to end
        // Create a do while loop that loops until the user inputs "done"
            // Scan the user's input as a string and attempt to convert it to an int
            // If the string cannot be converted to an int and the input equals "done", change the top variable to exit
            // the loop
        // Sort the arraylist in ascending order
        // Return the arraylist
    }

    public double[] calculateStatistics(ArrayList<Integer> responseTimeList){
        // Create a double array of size 4
        // Call average(responseTimeList) and return the input to position 0 of the array.
        // Call max(responseTimeList) and return the input to position 1 of the array.
        // Call min(responseTimeList) and return the input to position 2 of the array.
        // Call std(responseTimeList) and return the input to position 3 of the array.
        // Return the array
    }

    public String createStatisticsString(double[] statisticValues){
        // Create a string
        // Add to the string
            // The average is statisticValues[0]
            // The minimum is statisticValues[1]
            // The maximum is statisticValues[2]
            // The standard deviation is statisticValues[3]
        // Return the string
    }

    private double average(ArrayList<Integer> responseTimeList){
        // Create a for loop to find the total of responseTimeList
        // Return the total divided by the size of the arrayList
    }

    private int max(ArrayList<Integer> responseTimeList){
        // Return the value at the last index of responseTimeList
    }

    private int min(ArrayList<Integer> responseTimeList){
        // Return the value at the first index of responseTimeList
    }

    private double std(ArrayList<Integer> responseTimeList, double mean){
        // Create a double to store the numerator
        // Create a loop to go through every value in responseTimeList
            // Add to the numerator (the currentValue minus the mean) squared
        // Return the square root of (the numerator over the size of responseTimeList)
    }
}
