/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);
    private final Random rand = new Random();
    public static void main (String[] args){
        Solution35 app = new Solution35();
        // Create an arraylist and call getContestants()
        ArrayList<String> contestantList = app.getContestants();
        // Call findWinner(contestantList) and output the returned string
        System.out.println(app.findWinner(contestantList));
    }

    public ArrayList<String> getContestants(){
        ArrayList<String> contestantList = new ArrayList<>();
        // Create a temp variable to keep the loop going
        boolean continuePrompting = true;
        String tempContestant;
        // Create a do while loop
        do{
            // Prompt the user for input
            System.out.print("Enter a name: ");
            // Take the user's input and check if the input is blank
            tempContestant = input.nextLine();
            // If so change the temp variable to break from the loop, otherwise add to the arraylist
            if(tempContestant.isBlank()){
                continuePrompting = false;
            } else {
                contestantList.add(tempContestant);
            }
        } while (continuePrompting);
        // return the arraylist
        return contestantList;
    }

    public String findWinner(ArrayList<String> contestantList) {
        if(contestantList.isEmpty()){
            return "There were no contestants!";
        }
        // Generate a random number with the upper bound being the size of contestantList
        int winnerNum = rand.nextInt(contestantList.size());
        // Save the name of the contestant at randomNum to a string called contestantName
        String contestantName = contestantList.get(winnerNum);
        // Return a string stating "The winner is... contestantName."
        return "The winner is... " + contestantName + ".";
    }
}
