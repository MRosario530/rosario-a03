/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);
    private final Random rand = new Random();
    public static void main (String[] args) {
        Solution37 app = new Solution37();
        // Create an array for user constraints and call getUserInput()
        int[] userConstraints = app.getUserConstraints();
        // Create an arraylist for the password and call generatePassword(userConstraints)
        ArrayList<Character> generatedPassword = app.generatePassword(userConstraints);
        // Create a string and call constructPasswordString(generatedPassword)
        StringBuilder password = app.constructPasswordString(generatedPassword);
        // Print the password string
        System.out.println("Your password is " + password);
    }

    public int getUserInt(String prompt, int minValue){
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
                // Have an extra statement to not allow less than minValue as an input
                if (result < minValue) {
                    System.out.println("Enter a valid number at least equal to " + minValue + "!");
                    invalidInt = true;
                }
            } catch(NumberFormatException e) {
                System.out.println("Enter an actual number!");
                // Loop the previous statements until the user enters a valid int
                invalidInt = true;
            }
            // Loop until the user enters a valid int
        } while (invalidInt);
        // Returns the result
        return result;
    }

    public int[] getUserConstraints() {
        int[] userValues = new int[3];
        // Prompt the user for a minimum length
        userValues[0] = getUserInt("What's the minimum length? ", 1);
        // Prompt the user for the amount of special characters
        userValues[1] = getUserInt("How many special characters? ", 0);
        // Prompt the user for how many numbers
        userValues[2] = getUserInt("How many numbers? ", 0);
        // If the number of numbers plus the number of special characters times 2 is greater than the minimum length,
        // that value is the new minimum length because the password needs just as many letters as numbers and
        // symbols
        if (userValues[0] < (userValues[1]+userValues[2])*2) {
            userValues[0] = (userValues[1]+userValues[2])*2;
        }
        // Return the array
        return userValues;
    }

    public ArrayList<Character> generatePassword(int[] userConstraints){
        // Generate a random length of the password up to 10 more than the minimum amount possible
            // Minimum amount possible means that if the minimum length given is 4, but there needs to be at least 5
            // due to required letters, numbers, and symbols, it works off of that count instead.
        int lengthOfPassword = userConstraints[0] + rand.nextInt(10);
        // Create an empty arraylist called characterList to hold characters
        ArrayList<Character> characterList = new ArrayList<>();
        // Call generateNumbers(characterList, number of numbers) and assign it to the characterList
        generateNumbers(characterList, userConstraints[2]);
        // Call generateSymbols(characterList, number of symbols) and assign it to the characterList
        generateSymbols(characterList, userConstraints[1]);
        // Call generateLetters(characterList, number of letters) and assign it to the characterList
        generateLetters(characterList, lengthOfPassword -
                (userConstraints[2] + userConstraints[1]));
        // Shuffle characterList
        Collections.shuffle(characterList);
        // Return the now shuffled password
        return characterList;
    }

    public StringBuilder constructPasswordString(ArrayList<Character> generatedPassword){
        StringBuilder password = new StringBuilder();
        // Loop through the generatedPassword list, appending each character to a string
        for (Character character : generatedPassword) {
            password.append(character);
        }
        // Return the string
        return password;
    }

    private void generateNumbers(ArrayList<Character> characterList, int numOfNumbers){
        // Create a for loop to loop numOfNumbers times
        for (int i = 0; i < numOfNumbers; i++) {
            // Generate a random number from 0-9 and add it to the arraylist
            int randomNum = rand.nextInt(10);
            char convertedNum = (char) (randomNum + '0');
            characterList.add(convertedNum);
        }
    }

    private void generateSymbols(ArrayList<Character> characterList, int numOfSymbols){
        // Create a string with all the symbols inside
        String symbols = "!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        // Create a for loop to loop numOfSymbols times
        for (int i = 0; i < numOfSymbols; i++) {
            // Generate a random number from 0-string.length-1 and add the corresponding symbol
            char randomSymbol = symbols.charAt(rand.nextInt(symbols.length()));
            characterList.add(randomSymbol);
        }
    }

    private void generateLetters(ArrayList<Character> characterList, int numOfLetters){
        // Create a string with all the capital and lower case letters inside
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Create a for loop to loop numOfLetters times
        for (int i = 0; i < numOfLetters; i++) {
            // Generate a random number from 0-string.length-1 and add the corresponding letter
            char randomLetter = letters.charAt(rand.nextInt(letters.length()));
            characterList.add(randomLetter);
        }
    }
}
