/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution39 {
    static final String keyLastName = "Last Name";
    static final String keySeparation = "Separation Date";

    public static void main(String[] args){
        Solution39 app = new Solution39();
        // Create an arraylist of hashmaps called recordList and call createUnsortedRecordList() to give it values
        List<HashMap<String,String>> recordList = app.createUnsortedRecordList();
        // Call displaySortedRecordList(recordList) and save it as a string
        StringBuilder output = app.displaySortedRecordList(recordList);
        // Print the returned string to display the result in a tabular format
        System.out.println(output.toString());
    }

    public List<HashMap<String,String>> createUnsortedRecordList() {
        // Create an arraylist of hashmaps
        ArrayList<HashMap<String,String>> recordList = new ArrayList<>();
        // For each hashmap in the arraylist, have the keys be in ascending integer order and each parameter
        // correspond with a key (like 1, firstName)
        // Initialize and add all records to the arraylist recordlist
        recordList.add(createRecord("John", "Johnson",
                "Manager","2016-12-31"));
        recordList.add(createRecord("Tou", "Xiong",
                "Software Engineer","2016-10-05"));
        recordList.add(createRecord("Michaela", "Michaelson",
                "District Manager","2015-12-19"));
        recordList.add(createRecord("Jake", "Jacobson",
                "Programmer",""));
        recordList.add(createRecord("Jacquelyn", "Jackson",
                "DBA",""));
        recordList.add(createRecord("Sally", "Webber",
                "Web Developer","2015-12-18"));
        // Return the completed arraylist
        return recordList;
    }

    public StringBuilder displaySortedRecordList(List<HashMap<String,String>> recordList) {
        // Sort the recordList
        sortRecordList(recordList);
        // Create an empty string
        StringBuilder formattedRecordList = new StringBuilder();
        // Create a formatter to be able to easily format each entry of the list
        Formatter formatter = new Formatter(formattedRecordList);
        // Start the string with the labels at the top and beginning line
        formattedRecordList.append("Name                | Position          | Separation Date\n").
                append("--------------------|-------------------|----------------\n");
        // Loop through the recordlist, printing the name, position, and separation date with lines between each
        for (HashMap<String, String> temp : recordList) {
            String name = temp.get("First Name") + " " + temp.get(keyLastName);
            formatter.format("%-20s|", name);
            formatter.format(" %-18s|", temp.get("Position"));
            if(temp.get(keySeparation).length() != 0) {
                formatter.format(" %-1s", temp.get(keySeparation));
            }
            formattedRecordList.append("\n");
        }
        // Close the formatter
        formatter.close();
        // Return the final string
        return formattedRecordList;
    }

    private void sortRecordList(List<HashMap<String,String>> recordList) {
        // Set a string representing the key to sort by
        // Uses the collections.sort with the list and a comparator of HashMap<String, String>
        // and overide a compare method to compareTo the maps by last name
        // This code was simplified by solarlint to lambda style
        recordList.sort(Comparator.comparing(mapOne -> mapOne.get(keyLastName)));
    }

    private HashMap<String,String> createRecord(String firstName, String lastName,
                                                 String position, String separationDate) {
        HashMap<String,String> currentRecord = new HashMap<>();
        // In the order of the parameters, add each string to the HashMap
        currentRecord.put("First Name",firstName);
        currentRecord.put(keyLastName,lastName);
        currentRecord.put("Position",position);
        currentRecord.put(keySeparation,separationDate);
        // Return the hashmap
        return currentRecord;
    }
}
