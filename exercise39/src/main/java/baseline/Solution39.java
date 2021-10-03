/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution39 {
    public static void main(String[] args){
        // Create an arraylist of hashmaps called recordList and call createUnsortedRecordList() to give it values
        // Call sortRecordList(recordList) to sort by last name
        // Call formatRecordListString(recordList) and print the returned string to display the result in a tabular format
    }

    public ArrayList<HashMap<Integer,ArrayList<String>>> createUnsortedRecordList() {
        // Create an arraylist of hashmaps
        // For each hashmap in the arraylist, make the key an integer (which would be an identifier for its position)
            // Have the key count up (0, 1, 2, etc.)
            // Call createRecord() with the proper info and have that arraylist be the value
        // Return the completed arraylist
    }

    public ArrayList<HashMap<Integer,ArrayList<String>>> sortRecordList(ArrayList<HashMap<Integer,ArrayList<String>>> recordList) {
        // Create an arraylist of arraylists called storedRecords
        // Loop through the recordList, adding each arraylist to storedRecords
        // Call sort on storedRecords by last name
        // Go through recordList, replacing the corresponding keys with the values in order
        // return recordList
    }

    public String formatRecordListString(ArrayList<HashMap<Integer,ArrayList<String>>> recordList) {
        // Create an empty string
        // Using a formatter, have the first line of the string be the headers and the second line be ---
        // Loop through the recordlist, printing the name, position, and separation date with lines between each
        // Return the final string
    }

    private ArrayList<String> createRecord(String firstName, String lastName, String position, String separationDate){
        // Create an arraylist of strings
        // In the order of the parameters, add each string to the arraylist
        // Return the arraylist
    }
    

}
