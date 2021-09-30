/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution25 {
    public static void main(String[] args){
        /*
            Declare a string called password
            Ask the user to enter a string for password
            Call passwordValidator(password) and assign the returned value to an int passwordRating
            Call printPasswordStrength(passwordRating, password) and assign the returned value to a String passwordOutput
            Print passwordOutput
         */
    }

    public int passwordValidator(String password){
        /*
            Go through all password checking methods, returning an integer depending on the method
            if checkVeryWeakPassword(password) == true
                return 1
            else if checkWeakPassword(password) == true
                return 2
            else if checkStrongPassword(password) == true
                return 3
            else if checkVeryStrongPassword(password) == true
                return 4
            else
                return 0
         */
    }

    public boolean checkVeryWeakPassword(String password){
        // Create a regex string for only integers
        // Compare the regex to the password to see if it contains only integers
        // If not return false
        // Otherwise check the string length
        // If length is more than 8 return false
        // Otherwise return true
    }

    public boolean checkWeakPassword(String password){
        // Create a regex string for only letters
        // Compare the regex to the password to see if it contains only letters
        // If not return false
        // Otherwise check the string length
        // If length is more than 8 return false
        // Otherwise return true.
    }

    public boolean checkStrongPassword(String password){
        // Create a regex string for integers and letters
        // Compare the regex to the password to see if it contains letters and integers
        // If not return false
        // Otherwise check the string length
        // If length is less than 8 return false
        // Otherwise return true.
    }

    public boolean checkVeryStrongPassword(String password){
        // Create a regex string for integers, letters, and special characters
        // Compare the regex to the password to see if it contains letters, integers, and special characters
        // If not return false
        // Otherwise check the string length
        // If length is less than 8 return false
        // Otherwise return true.
    }

    public String printPasswordStrength(int passwordRating, String password){
        // Create a string passwordOutput which starts with "The password" + password + "is a "
        // Depending on the value of passwordRating add the corresponding words to the string
        // if passwordRating = 1 add "very weak password."
        // else if passwordRating = 2 add "weak password."
        // else if passwordRating = 3 add "strong password."
        // else if passwordRating = 4 add "very strong password."
        // else add "password of unknown strength."
        // return passwordOutput
    }
}
