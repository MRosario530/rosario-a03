/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */

package baseline;

public class Solution32 {
    public static void main(String[] args){
        // Create a do while loop and a char to represent whether or not the user wants to play again
        // Print "Let's play Guess the Number!"
        // Create an int called difficultyLevel and prompt the user to enter 1,2, or 3
            // Use getUserInt("enter 1,2, or 3") to obtain the value from the user,
            // loop the above step if 1,2, or 3 is not given.
        // Create an int called guessingGameResult and call the method playGuessingGame(difficultyLevel)
        // Print the amount of guesses and asks the user if they want to play again
        // If the user says 'y', loop through the above steps once again. If not, exit the program.
    }

    public int getUserInt(String prompt){
        // Create a variable responsible for maintaining the loop
        // Prompt the user to enter a number
        // Attempt to read in an int using a try/catch and a loop
        // Have a print statement within the catch for not a valid input
        // Loop until the user enters a valid int
        // Return the user int
    }

    public int playGuessingGame(int difficultyLevel){
        // Create an if statement that takes the difficulty level and sets the upperbound of a random int method
            // depending on which difficulty level was chosen
        // Create a counter to store the number of guesses the player makes
        // Create a do while loop that continues while the user's guess does not equal the random number
            // Scan the user's input
            // if the user's input is valid, call tellHigherOrLower(randomNum, userGuess)
            // add to the count
        // Return the number of guesses
    }

    private void tellHigherOrLower(int randomNum, int userGuess){
        // if userGuess is greater than randomNum, print that the user should guess lower
        // else if userGuess is less than randomNum, print that the user should guess higher
    }

}
