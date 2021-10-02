/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.text.DecimalFormat;
import java.util.*;

public class Solution36 {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        Solution36 app = new Solution36();
        // Create an arraylist called responseTimeList and call getResponseTimes()
        ArrayList<Double> responseTimeList = app.getResponseTimes();
        if(!responseTimeList.isEmpty()) {
            // Create an array called statisticValues with 4 positions, each holding a different calculation
            // Call calculateStatistics(responseTimeList) and have it return an array to statisticValues
            double[] statisticValues = app.calculateStatistics(responseTimeList);
            // Print a string created by the method createStatisticsString(statisticValues)
            System.out.println(app.createStatisticsString(statisticValues));
        } else {
            System.out.println("You didn't input anything! Or at least, anything valid.");
        }
    }

    public ArrayList<Double> getResponseTimes() {
        // Sort the arraylist in ascending order
        // Return the arraylist
        ArrayList<Double> responseTimeList = new ArrayList<>();
        // Create a variable responsible for telling the loop when to end
        boolean continueLooping = true;
        // Create a do while loop that loops until the user inputs "done"
        do{
            double result;
            String userInput = "";
            // Attempt to read in an int using a try/catch
            try {
                // Display the prompt
                System.out.print("Enter a number: ");
                // Scan the user's input as a string and attempt to convert it to an int
                userInput = input.nextLine();
                result = Double.parseDouble(userInput);
                if (result > 0) {
                    responseTimeList.add(result);
                } else {
                    System.out.println("Values less than or equal to 0 aren't accepted.");
                }
            } catch(NumberFormatException e) {
                // If the string cannot be converted to an int and the input equals "done",
                // change continueLooping to false
                if (userInput.equalsIgnoreCase("done")){
                    continueLooping = false;
                }
            }
        } while (continueLooping);
        Collections.sort(responseTimeList);
        return responseTimeList;
    }

    public double[] calculateStatistics(ArrayList<Double> responseTimeList){
        // Create a double array of size 4
        double[] statisticsList = new double[4];
        // Call average(responseTimeList) and return the input to position 0 of the array.
        statisticsList[0] = average(responseTimeList);
        // Call min(responseTimeList) and return the input to position 1 of the array.
        statisticsList[1] = min(responseTimeList);
        // Call max(responseTimeList) and return the input to position 2 of the array.
        statisticsList[2] = max(responseTimeList);
        // Call std(responseTimeList) and return the input to position 3 of the array.
        statisticsList[3] = std(responseTimeList, statisticsList[0]);
        // Return the array
        return statisticsList;
    }

    public String createStatisticsString(double[] statisticValues){
        DecimalFormat df = new DecimalFormat("0.0#");
        // Create a string
        String displayCalculations = "";
        // Add to the string The average is statisticValues[0]
        displayCalculations += "The average is " + df.format(statisticValues[0]) + "\n";
        df = new DecimalFormat("0.##");
        // Add to the string The minimum is statisticValues[1]
        displayCalculations += "The minimum is " + df.format(statisticValues[1]) + "\n";
        // Add to the string The maximum is statisticValues[2]
        displayCalculations += "The maximum is " + df.format(statisticValues[2]) + "\n";
        // Add to the string The standard deviation is statisticValues[3]
        displayCalculations += "The standard deviation is " + df.format(statisticValues[3]);
        // Return the string
        return displayCalculations;
    }

    private double average(ArrayList<Double> responseTimeList){
        // Create a for loop to find the total of responseTimeList
        double total = 0;
        for (Double value : responseTimeList) {
            total += value;
        }
        return total/responseTimeList.size();
        // Return the total divided by the size of the arrayList
    }

    private double max(ArrayList<Double> responseTimeList){
        // Return the value at the last index of responseTimeList
        return responseTimeList.get(responseTimeList.size()-1);
    }

    private double min(ArrayList<Double> responseTimeList){
        // Return the value at the first index of responseTimeList
        return responseTimeList.get(0);
    }

    private double std(ArrayList<Double> responseTimeList, double mean){
        // Create a double to store the numerator
        double numerator = 0;
        // Create a loop to go through every value in responseTimeList
        for (double value : responseTimeList){
            // Add to the numerator (the currentValue minus the mean) squared
            numerator += Math.pow(value-mean,2);
        }
        // Return the square root of (the numerator over the size of responseTimeList)
        return Math.sqrt(numerator/responseTimeList.size());
    }
}
