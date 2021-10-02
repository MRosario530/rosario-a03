/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution33 {

    private static final Scanner input = new Scanner(System.in);
    private final Random rand = new Random();
    public static void main(String[] args){
        Solution33 app = new Solution33();
        // Prompt the user to enter a question
        System.out.print("What's your question?\n> ");
        String question = input.nextLine();
        // Call generateRandomNum and store the value
        int randomNum = app.generateRandomNum();
        // Call get8BallResponse(randomNum) and print the response
        System.out.println("\n" + app.get8BallResponse(randomNum));
    }
    public int generateRandomNum(){
        // Generates a random number from 0-3 and returns the random number
        return rand.nextInt(4);
    }

    public String get8BallResponse(int randomNum){
        // Create an arraylist and add the 4 phrases: "Yes," "No," "Maybe," and "Ask again later."
        ArrayList<String> responses = new ArrayList<>();
        responses.add("Yes.");
        responses.add("No.");
        responses.add("Maybe.");
        responses.add("Ask again later.");
        // Return the String corresponding with the randomNum
        return responses.get(randomNum);
    }
}
