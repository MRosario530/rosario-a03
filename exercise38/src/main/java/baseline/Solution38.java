/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

public class Solution38 {
    public static void main(String[] args){
        // Prompt the user to enter a list of numbers separated by spaces and save the input to string userInput
        // Create an array called filteredArray and call filterEvenNumbers(userInput)
        // Print the string from createArrayString(filteredArray)
    }

    public int[] filterEvenNumbers(String userInput){
        // Create an int array and call convertStringToArray(userInput)
        // Call findEvenNumbers(unfilteredArray) and return the result
    }

    public String createArrayString(int[] filteredArray){
        // Create a string with the initial message "The even numbers are "
        // Loop through the filteredArray, adding each value to the string
        // Return the completed String
    }

    private int[] convertStringToArray(String userInput){
        // Create an integer array to hold all valid integers
        // Create a string array to hold the split string prior to filtering out non-integers
        // Split the string into the array by the " " character
        // Loop through the array, attempting to parseInt each value with a try/catch
            // If no issue arises, add to the integer array
        // Return the Integer array
    }

    private int[] findEvenNumbers(int[] unfilteredArray) {
        // Create an int array filteredArray
        // Loop through the array, taking the value of the current integer and doing mod(%) 2 to the value
            // If the remainder is 0, the number is even and added to the filtered array
        // Return the filtered array
    }

}
