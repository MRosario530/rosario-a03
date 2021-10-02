/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.ArrayList;

public class Solution37 {
    public static void main (String[] args) {
        // Create an array for user constraints and call getUserInput()
        // Create an arraylist for the password and call generatePassword(userConstraints)
        // Create a string and call constructPassword(generatedPassword)
        // Print the password string
    }

    public int[] getUserInput() {
        // Prompt the user for a minimum length
            // Validate that the number given is valid and above 0
        // Prompt the user for the amount of special characters
        // Validate that the number given is valid and is equal to or greater than 0
        // Prompt the user for how many numbers
        // Validate that the number given is valid and is equal to or greater than 0
        // If the number of numbers plus the number of special characters times 2 is greater than the minimum length,
            // that value is the new minimum length
        // Return the array
    }

    public ArrayList<Character> generatePassword(int[] userConstraints){
        // Create an empty arraylist called characterList to hold characters
        // Call generateNumbers(characterList, number of numbers) and assign it to the characterList
        // Call generateSymbols(characterList, number of symbols) and assign it to the characterList
        // Call generateLetters(characterList, number of letters) and assign it to the characterList
        // Shuffle characterList
        // Return the now shuffled password

    }

    public StringBuilder constructPassword(ArrayList<Character> generatedPassword){
        // Loop through the generatedPassword list, appending each character to a string
        // Return the string
    }

    private ArrayList<Character> generateNumbers(ArrayList<Character> characterList, int numOfNumbers){
        // Create a random object
        // Create a for loop to loop numOfNumbers times
            // Generate a random number from 0-9 and add it to the arraylist
        // Return the arraylist
    }

    private ArrayList<Character> generateSymbols(ArrayList<Character> characterList, int numOfSymbols){
        // Create a random object
        // Create a string with all the symbols inside
        // Create a for loop to loop numOfSymbols times
            // Generate a random number from 0-string.length-1 and add the corresponding symbol
        // Return the arraylist
    }

    private ArrayList<Character> generateLetters(ArrayList<Character> characterList, int numOfLetters){
        // Create a random object
        // Create a string with all the capital and lower case letters inside
        // Create a for loop to loop numOfLetters times
            // Generate a random number from 0-string.length-1 and add the corresponding letter
        // Return the arraylist
    }
}
