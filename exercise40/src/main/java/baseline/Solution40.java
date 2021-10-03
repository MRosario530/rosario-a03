/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution40 {
    public static void main(String[] args){
        // Create an arraylist of hashmaps called recordList and call createRecordList() to give it values
        // Prompt the user to input the search string and save the response to a string searchString
        // Call findSearchedEmployees(recordList, searchString) and print the result
    }

    public List<HashMap<String,String>> createRecordList() {
        // Create an arraylist of hashmaps
        // For each employee, call createRecord(firstName, lastName, position, separationDate)
            // and add them to the arraylist of hashmaps
        // Sort the recordList
        // Return the completed arraylist
    }

    public StringBuilder findSearchedEmployees(List<HashMap<String,String>> recordList, String searchString){
        // Create an arrayList of hashmaps called matchedEmployees and call searchRecordList to find employees
        // Create a string and assign the header to its value
        // Loop through the array, adding to the string each person's name, position, and separation date
            // formatted properly
        // Return the completed string
    }

    private List<HashMap<String,String>> searchRecordList(List<HashMap<String,String>> recordList,
                                                          String searchString) {
        // Create a list of hashmaps called matchedEmployees to store all employees found by the search string
        // Loop through the list, checking if either the firstName string or the lastName string contain searchString
            // If so, add them to matchedEmployees
        // Return the matchedEmployees list
    }


    private HashMap<String,String> createRecord(String firstName, String lastName,
                                                String position, String separationDate) {
        // Create a temporary hashmap
        // Add to the hashmap each string under the keys "First Name", "Last Name",
            // "Position", and "Separation Date"
        // Return the hashmap
    }

}
