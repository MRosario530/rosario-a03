/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution38 app = new Solution38();
        // Prompt the user to enter a list of numbers separated by spaces and save the input to string userInput
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userInput = input.nextLine();
        // Create an arraylist called filteredArray and call filterEvenNumbers(userInput)
        ArrayList<Integer> filteredArrayList = app.filterEvenNumbers(userInput);
        // Print the string from createArrayListString(filteredArrayList)
        System.out.println(app.createArrayListString(filteredArrayList));
    }

    public ArrayList<Integer> filterEvenNumbers(String userInput){
        // Create an int arraylist and call convertStringToArrayList(userInput)
        ArrayList<Integer> unfilteredArray = convertStringToArrayList(userInput);
        // Call findEvenNumbers(unfilteredArrayList) and return the result
        return findEvenNumbers(unfilteredArray);
    }

    public StringBuilder createArrayListString(ArrayList<Integer> filteredArray){
        // Create a string with the initial message "The even numbers are "
        StringBuilder resultString = new StringBuilder("The even numbers are ");
        // If there are no values that were valid, return the initial message with nothing following
        if(filteredArray.isEmpty()){
            return resultString;
        }
        // Loop through the filteredArrayList, adding each value to the string
        for (int j : filteredArray) {
                resultString.append(j).append(" ");
        }
        // Return the completed String
        return resultString.append(".");
    }

    private ArrayList<Integer> convertStringToArrayList(String userInput){
        // Create an integer array to hold all valid integers
        // Create a string array to hold the split string prior to filtering out non-integers
        String[] userStrings;
        // Split the string into the array by the " " character
        userStrings = userInput.split(" ");
        ArrayList<Integer> unfilteredInts = new ArrayList<>();
        // Loop through the array, attempting to parseInt each string with a try/catch
        for (String userString : userStrings) {
            try {
                int tempInt = Integer.parseInt(userString);
                // If no issue arises, add to the integer arraylist
                unfilteredInts.add(tempInt);
            } catch (NumberFormatException ignored) {
                // The reason why there is nothing in this catch block is because we don't care about
                // the non-integer inputs from the user. There is no error print statement here or acknowledgement
                // due to an abundance of caution on what is expected of the output.
            }
        }
        // Return the integer arrayList
        return unfilteredInts;
    }

    private ArrayList<Integer> findEvenNumbers(ArrayList<Integer> unfilteredArray) {
        // Create an int arraylist named filteredArray
        ArrayList<Integer> filteredInts = new ArrayList<>();
        // Loop through the array, taking the value of the current integer and doing mod(%) 2 to the value
        for (int j : unfilteredArray) {
            // If the remainder is 0, the number is even and added to the filtered arraylist except 0
            if (j % 2 == 0 && j != 0) {
                filteredInts.add(j);
            }
        }
        // Return the filtered arraylist
        return filteredInts;
    }

}
