/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Scanner;

public class Solution27 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution27 app = new Solution27();
        // Create a string called firstName and call gatherInput(Enter the first name)
        String firstName = app.gatherInput("Enter the first name: ");
        // Create a string called lastName and call gatherInput(Enter the last name)
        String lastName = app.gatherInput("Enter the last name: ");
        // Create a string called zipCode and call gatherInput(Enter the zip code)
        String zipCode = app.gatherInput("Enter the ZIP code: ");
        // Create a string called empId and call gatherInput(Enter the employee ID)
        String empID = app.gatherInput("Enter the employee ID: ");
        // Run all strings through validateInput and print the returned string
        System.out.println(app.validateInput(firstName,lastName,zipCode,empID));

    }

    public String gatherInput(String prompt){
        // Prompts the user for input using "prompt"
        System.out.print(prompt);
        // returns the user's input as a string.
        return input.nextLine();
    }

    public String validateInput(String firstName, String lastName, String zipCode, String empID){
        // Create a string called inputResult
        String inputResult = "";
        // Create a counter called errorCount
        int errorCount = 0;
        // If isNameShorterThanTwo(firstName) returns true, add "The first name must be at least 2 characters long."
        if(isNameShorterThanTwo(firstName)){
            inputResult += "The first name must be at least 2 characters long.\n";
            errorCount++;
        }
        // If isNameEmpty(firstName) returns true, add "The first name must be filled in."
        if(isNameEmpty(firstName)){
            inputResult += "The first name must be filled in.\n";
            errorCount++;
        }
        // If isNameTwoOrMoreLong(lastName) returns false, add "The last name must be at least 2 characters long."
        if(isNameShorterThanTwo(lastName)){
            inputResult += "The last name must be at least 2 characters long.\n";
            errorCount++;
        }
        // If isNameFilled(lastName) returns false, add "The last name must be filled in."
        if(isNameEmpty(lastName)){
            inputResult += "The last name must be filled in.\n";
            errorCount++;
        }
        // If isEmpIDValid(empID) returns false, add "The employee ID must be in the format of AA-1234."
        if(!isEmpIDValid(empID)){
            inputResult += "The employee ID must be in the format of AA-1234.\n";
            errorCount++;
        }
        // If isZipCodeValid(zipCode) returns false, add "The zipcode must be a 5 digit number."
        if(!isZipCodeValid(zipCode)){
            inputResult += "The zipcode must be a 5 digit number.\n";
            errorCount++;
        }
        // If errorCount equals 0 add "There were no errors found."
        if(errorCount == 0){
            inputResult = "There were no errors found.\n";
        }
        // Return the string inputResult
        return inputResult;

    }

    private boolean isNameEmpty(String name){
        // Check and return whether or not name is blank
        return name.isBlank();
    }

    private boolean isNameShorterThanTwo(String name){
        // Check and return whether or not name meets the minimum length of 2 characters
        return name.length() < 2;
    }

    private boolean isEmpIDValid(String empID){
        // Compare empID to a regex with 2 characters in front, a "-", and 4 numbers at the end
        return empID.matches("^[a-zA-Z]{2}-[\\d]{4}$");
    }

    private boolean isZipCodeValid(String zipCode){
        // Check if zipCode length is exactly 5, if not return false
        if(zipCode.length() != 5){
            return false;
        }else{
            // If so attempt to parseInt the zipCode, have a try/catch return false if the zipCode causes an error
            try {
                Integer.parseInt(zipCode);
            } catch(NumberFormatException e) {
                return false;
            }
            // Otherwise, return true
            return true;
        }
    }

}
