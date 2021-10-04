/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution25 app = new Solution25();
        // Ask the user to enter a string for password
        System.out.print("Please enter a password: ");
        // Declare a string called password
        String password = input.nextLine();
        // Call passwordValidator(password) and assign the returned value to an int passwordRating
        int passwordRating = app.passwordValidator(password);
        // Call printPasswordStrength(passwordRating, password) and print the output
        System.out.println(app.printPasswordStrength(passwordRating, password));
    }

    public int passwordValidator(String password){
        // Go through all password checking methods,
        // returning an integer depending on which password method returns true
        // If none of the methods return true, return 0 for unknown strength
        if (checkVeryWeakPassword(password)){
            return 1;
        }
        else if (checkWeakPassword(password)){
            return 2;
        }
        else if (checkStrongPassword(password)){
            return 3;
        }
        else if (checkVeryStrongPassword(password)){
            return 4;
        } else {
            return 0;
        }
    }

    public String printPasswordStrength(int passwordRating, String password){
        // Create a string passwordOutput which starts with "The password" + password + "is a "
        // Depending on the value of passwordRating add the corresponding words to the string
        String passwordOutput = "The password '" + password + "' is a ";
        if (passwordRating == 1){
            passwordOutput += "very weak password.";
        }
        else if (passwordRating == 2){
            passwordOutput += "weak password.";
        }
        else if (passwordRating == 3){
            passwordOutput += "strong password.";
        }
        else if (passwordRating == 4){
            passwordOutput += "very strong password.";
        } else {
            // If the value of passwordRating is 0, the words will indicate the strength of the password is unknown
            passwordOutput += "password of unknown strength.";
        }
        // Return passwordOutput
        return passwordOutput;
    }

    private boolean checkVeryWeakPassword(String password){
        // Compare a regex string to the password to see if it contains only integers
        // Return false if this is not true
        if(!password.matches("[0-9]+")){
            return false;
        }else {
            // Otherwise, check the string length and return whether or not the length is less than 8
            return password.length() < 8;
        }
    }

    private boolean checkWeakPassword(String password){
        // Compare a regex string to the password to see if it contains only letters
        // Return false if this is not true
        if(!password.matches("[a-zA-Z]+")){
            return false;
        }else {
            // Otherwise, check the string length and return whether or not the length is less than 8
            return password.length() < 8;
        }
    }

    private boolean checkStrongPassword(String password){
        // Compare a regex string to the password to see if it contains only letters and numbers
        // Return false if this is not true
        if(!password.matches("[a-zA-Z]+[0-9]+[^!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~]+")){
            return false;
        }else {
            // Otherwise, check the string length and return whether or not the length is more than or equal to 8
            return password.length() >= 8;
        }
    }

    private boolean checkVeryStrongPassword(String password){
        // Compare a regex string to the password to see if it contains only letters, numbers, and symbols
        // Return false if this is not true
        if(!password.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~]).*")){
            return false;
        }else{
            return password.length() >= 8;
        }
    }


}
