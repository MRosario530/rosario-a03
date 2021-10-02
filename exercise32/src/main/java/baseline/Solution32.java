/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution32 {

    private static final Scanner input = new Scanner(System.in);
    private final Random rand = new Random();
    public static void main(String[] args){
        Solution32 app = new Solution32();
        // Print "Let's play Guess the Number!"
        System.out.println("Let's play Guess the Number!\n");
        // Create a do while loop and a char to represent whether the user wants to play again
        char playAgain;
        do{
            // Create an int called difficultyLevel and use getUserInt("enter 1,2, or 3") to obtain a value from the
            // user, loop the above step if 1,2, or 3 is not given
            int difficultyLevel;
            do {
                difficultyLevel = app.getUserInt("Enter the difficulty level (1, 2, or 3): ");
            } while (difficultyLevel != 1 && difficultyLevel != 2 && difficultyLevel != 3);
            // Create an int called guessingGameResult and call the method loadGuessingGame(difficultyLevel)
            int guessingGameResult = app.loadGuessingGame(difficultyLevel);
            // Print the amount of guesses using result(guessingGameResult)
            System.out.println(app.createResultString(guessingGameResult));
            // Ask the user if they want to play again using getUserYesOrNo("Do you wish to play again") and if not,
            // end the program
            playAgain = app.getUserYesOrNo("Do you wish to play again (Y/N)? ");
        } while (playAgain != 'N');
    }

    public int getUserInt(String prompt){
        int result = 0;
        // Create a variable responsible for maintaining the loop
        boolean invalidInt;
        do {
            invalidInt = false;
            try {
                // Display the prompt
                System.out.print(prompt);
                // Attempt to read in an int using a try/catch and a loop
                String userInput = input.nextLine();
                result = Integer.parseInt(userInput);
            } catch(NumberFormatException e) {
                System.out.println("Enter a valid number!");
                // Loop the previous statements until the user enters a valid int
                invalidInt = true;
            }
            // Loop until the user enters a valid int
        } while (invalidInt);
        // Returns the result
        return result;
    }

    public char getUserYesOrNo(String prompt) {
        // Create a string and a char to hold the user's response
        char userChoice;
        String userInput;
        // Loop until the user enters 'y' or 'n'
        do {
            do {
                // Prompt the user for input
                System.out.print(prompt);
                userInput = input.nextLine();
                // Set the input to uppercase to allow for simple comparison
                userInput = userInput.toUpperCase();
            } while (userInput.length() == 0);
             userChoice = userInput.charAt(0);
        }while(userChoice != 'Y' && userChoice != 'N');
        // Return user's choice between 'Y' and 'N'
        return userChoice;
    }

    public String createResultString(int guessingGameResult){
        // If the result of the game is one guess, return "You got it in 1 guess!"
        if (guessingGameResult == 1) {
            return "You got it in " + guessingGameResult + " guess!";
        }
        // Otherwise return "You got it in 'guessingGameResult' guesses!"
        return "You got it in " + guessingGameResult + " guesses!";
    }

    public int loadGuessingGame(int difficultyLevel){
        // Create an if statement that takes the difficulty level and sets the upperbound of a random int method
            // depending on which difficulty level was chosen
        int randomNum = 0;
        if (difficultyLevel == 1) {
            randomNum = rand.nextInt(10)+1;
        } else if (difficultyLevel == 2) {
            randomNum = rand.nextInt(100)+1;
        } else if (difficultyLevel == 3) {
            randomNum = rand.nextInt(1000)+1;
        }

        // Return the number of guesses after playing the game
        return playGame(randomNum);
    }

    private int playGame(int randomNum){
        // Create a counter to store the number of guesses the player makes
        int guessCount = 0;
        // Create an integer to store the current guess to compare to randomNum
        int currentGuess = 0;
        // Create a do while loop that continues while the user's guess does not equal the random number
        do {
            // Ask simply for the user's guess on the first iteration of the loop
            if(guessCount == 0){
                System.out.print("I have my number. What's your guess? ");
            } else {
            // Otherwise, call tellHigherOrLower to determine the user's guess in relation to the random number
                tellHigherOrLower(randomNum,currentGuess);
            }
            // Try scanning the user's input for the next integer, if the input is not an integer the counter
            // for guesses will still go up
            try {
                String userInput = input.nextLine();
                currentGuess = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("This input was invalid!");
            }
            guessCount++;
        // Continue until the user guesses the random number
        } while (currentGuess != randomNum);
        // Return the number of guesses it took the user
        return guessCount;
    }

    private void tellHigherOrLower(int randomNum, int userGuess){
        // If userGuess is greater than randomNum, print that the user guessed too high
        if (userGuess > randomNum){
            System.out.print("Too high. Guess again: ");
        // Else if userGuess is less than randomNum, print that the user guessed too low
        } else if (userGuess < randomNum) {
            System.out.print("Too low. Guess again: ");
        }
    }
}
