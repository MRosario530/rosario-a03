/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

public class Solution27 {
    public static void main(String[] args){
        /*  Create a string called firstName and call gatherInput(Enter the first name)
            Create a string called lastName and call gatherInput(Enter the last name)
            Create a string called empId and call gatherInput(Enter the employee ID)
            Create a string called zipCode and call gatherInput(Enter the zip code)
            Run all strings through validateInput and print the returned string
         */
    }

    public String gatherInput(String prompt){
        // Prompts the user for input using "prompt"
        // returns the user's input as a string.
    }

    public String validateInput(String firstName, String lastName, String zipCode, String empID){
        /*  Create a string called inputResult
            If isNameTwoOrMoreLong(firstName) returns false
                add "The first name must be at least 2 characters long."
            If isNameFilled(firstName) returns false
                add "The first name must be filled in."
            If isNameTwoOrMoreLong(lastName) returns false
                add "The last name must be at least 2 characters long."
            If isNameFilled(lastName) returns false
                add "The last name must be filled in."
            If isEmpIDValid(empID) returns false
                add "The employee ID must be in the format of AA-1234."
            If isZipCodeValid(zipCode) returns false
                add "The zipcode must be a 5 digit number."
            If none of the above are false
                add "There were no errors found."
            Return the string inputResult
        */
    }

    private boolean isNameFilled(String name){
        // Check if the name is blank
        // Return whether or not it is blank
    }

    private boolean isNameTwoOrMoreLong(String name){
        // Check if the name length is at least 2 characters long
        // Return whether or not it meets the minimum length of 2 characters
    }

    private boolean isEmpIDValid(String empID){
        /*  Check if empID length is exactly 7
                If not return false
            Otherwise compare empID to a regex with 2 characters in front, a "-", and 4 numbers at the end
                return the result
         */
    }

    private boolean isZipCodeValid(String zipCode){
        /*  Check if zipCode length is exactly 5
                If not return false
            If so attempt to parseInt the zipCode
                Have a try/catch return false if the zipCode causes an error
            Otherwise return true
         */
    }

}
