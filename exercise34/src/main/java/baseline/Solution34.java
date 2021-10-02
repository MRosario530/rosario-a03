/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution34 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution34 app = new Solution34();
        // Create an arraylist of 5 employees
        ArrayList<String> employeeList;
        employeeList = app.createEmployeeList();
        // Call the method formatEmployeeList(employeeList) to display how many employees and the names of them all
        System.out.println(app.formatEmployeeList(employeeList));
        // Prompt the user to enter an employee name to remove
        System.out.print("Enter an employee name to remove: ");
        String employeeName = input.nextLine();
        System.out.println();
        // Call the method removeEmployee(employeeList, employeeName) and return the possibly altered arraylist
        employeeList = app.removeEmployee(employeeList, employeeName);
        // Call the method formatEmployeeList(employeeList) to display the remaining employees
        System.out.println(app.formatEmployeeList(employeeList));
    }

    public StringBuilder formatEmployeeList(ArrayList<String> employeeList){
        // Create a StringBuilder called employeeDisplay
        // Add to the StringBuilder "There are employeeList.size() employees"
        StringBuilder employeeDisplay = new StringBuilder("There are " + employeeList.size() + " employees:\n");
        // Create a for loop from 0 to employeeList.size()
        for (String s : employeeList) {
            // Add each name to the StringBuilder followed by a \n
            employeeDisplay.append(s).append("\n");
        }
        // Return the StringBuilder employeeDisplay
        return employeeDisplay;
    }

    public ArrayList<String> createEmployeeList(){
        // Initialize an arraylist
        ArrayList<String> employeeList = new ArrayList<>();
        // Add appropriate strings to the list
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        // Return the list
        return employeeList;
    }

    public ArrayList<String> removeEmployee(ArrayList<String> employeeList, String employeeName){
        // Index through the arraylist to see if employeeName is present within the list
        // If so, remove employeeName
        employeeList.removeIf(s -> s.equalsIgnoreCase(employeeName));
        // Return the list
        return employeeList;
    }
}
