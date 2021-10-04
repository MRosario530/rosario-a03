/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution40 {
    static final String first = "First Name";
    static final String last = "Last Name";
    static final String pos = "Position";
    static final String separate = "Separation Date";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Solution40 app = new Solution40();
        // Create a list of hashmaps called recordList and call createRecordList() to give it values
        List<HashMap<String,String>> recordList = app.createRecordList();
        // Prompt the user to input the search string and save the response to a string searchString
        System.out.print("Enter a search string: ");
        String searchString = input.nextLine();
        // Call findSearchedEmployees(recordList, searchString) and print the result
        StringBuilder matchingEmployeesTable = app.findSearchedEmployees(recordList,searchString);
        System.out.println(matchingEmployeesTable.toString());
    }

    public List<HashMap<String,String>> createRecordList() {
        // Create an arraylist of hashmaps
        List<HashMap<String,String>> recordList = new ArrayList<>();
        // For each employee, call createRecord(firstName, lastName, position, separationDate)
            // and add them to the arraylist of hashmaps
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

    public StringBuilder findSearchedEmployees(List<HashMap<String,String>> recordList, String searchString){
        // Create an arrayList of hashmaps called matchedEmployeesList and call searchRecordList to find employees
        List<HashMap<String,String>> matchedEmployeesList = searchRecordList(recordList, searchString);
        // Sort the array by last name for printing
        matchedEmployeesList.sort(Comparator.comparing(employee -> employee.get(last)));
        // Create a string and start the string with the labels at the top and beginning line
        StringBuilder matchingEmployeesTable = new StringBuilder();
        matchingEmployeesTable.append("Results:\n\n");
        matchingEmployeesTable.append("Name                | Position          | Separation Date\n").
                append("--------------------|-------------------|----------------\n");
        // Create a formatter to be able to easily format each entry of the list
        Formatter formatter = new Formatter(matchingEmployeesTable);
        // Loop through the array, adding to the string each person's name, position, and separation date
            // formatted properly
        for (HashMap<String, String> temp : matchedEmployeesList) {
            String name = temp.get(first) + " " + temp.get(last);
            formatter.format("%-20s|", name);
            formatter.format(" %-18s|", temp.get(pos));
            if(temp.get(separate).length() != 0) {
                formatter.format(" %-1s", temp.get(separate));
            }
            matchingEmployeesTable.append("\n");
        }
        // Close the formatter
        formatter.close();
        // Return the completed string
        return matchingEmployeesTable;
    }

    private List<HashMap<String,String>> searchRecordList(List<HashMap<String,String>> recordList,
                                                          String searchString) {
        // Create a list of hashmaps called matchedEmployeesList to store all employees found by the search string
        List<HashMap<String,String>> matchedEmployeesList = new ArrayList<>();
        // Loop through the list, checking if either the firstName string or the lastName string contain searchString
            // If so, add them to matchedEmployeesList
        for (HashMap<String, String> temp : recordList) {
            if (temp.get(first).contains(searchString) || temp.get(last).contains(searchString)) {
                matchedEmployeesList.add(temp);
            }
        }
        // Return the matchedEmployeesList
        return matchedEmployeesList;
    }

    private HashMap<String,String> createRecord(String firstName, String lastName,
                                                String position, String separationDate) {
        // Create a temporary hashmap
        HashMap<String,String> currentRecord = new HashMap<>();
        // Add to the hashmap each string under the keys "First Name", "Last Name",
        // "Position", and "Separation Date"
        currentRecord.put(first,firstName);
        currentRecord.put(last,lastName);
        currentRecord.put(pos,position);
        currentRecord.put(separate,separationDate);
        // Return the hashmap
        return currentRecord;
    }

}
