/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;
import java.util.regex.*;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Solution25 app = new Solution25();
        /*
            Declare a string called password
            Ask the user to enter a string for password
            Call passwordValidator(password) and assign the returned value to an int passwordRating
            Call printPasswordStrength(passwordRating, password) and assign the returned value to a String passwordOutput
            Print passwordOutput
         */

        String password = input.nextLine();
        int passwordRating = app.passwordValidator(password);
        System.out.println(app.printPasswordStrength(passwordRating, password));
    }

    public int passwordValidator(String password){
        //Go through all password checking methods, returning an integer depending on the method
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

    public boolean checkVeryWeakPassword(String password){
        // Create a regex string for only integers
        // Compare the regex to the password to see if it contains only integers
        // If not return false
        // Otherwise check the string length
        // If length is more than 8 return false
        // Otherwise return true
        String regex = "^[0-9]+$";
        Pattern veryWeakPattern = Pattern.compile(regex);
        Matcher patternMatcher = veryWeakPattern.matcher(password);

        if(!patternMatcher.matches()){
            return false;
        }else {
            return password.length() < 8;
        }
    }

    public boolean checkWeakPassword(String password){
        // Create a regex string for only letters
        // Compare the regex to the password to see if it contains only letters
        // If not return false
        // Otherwise check the string length
        // If length is more than 8 return false
        // Otherwise return true.
        String regex = "^[a-zA-Z]+$";
        Pattern weakPattern = Pattern.compile(regex);
        Matcher patternMatcher = weakPattern.matcher(password);

        if(!patternMatcher.matches()){
            return false;
        }else {
            return password.length() < 8;
        }
    }

    public boolean checkStrongPassword(String password){
        // Create a regex string for integers and letters
        // Compare the regex to the password to see if it contains letters and integers
        // If not return false
        // Otherwise check the string length
        // If length is less than 8 return false
        // Otherwise return true.

        // Pattern special = Pattern.compile (".[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]+$");
        // Matcher patternMatcher = special.matcher(password);
        // System.out.println(patternMatcher.matches());
        // if(!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9]).*$") || patternMatcher.matches()){
        //    return false;
        //}else{
        //    return password.length() >= 8;
        //}

    }

    public boolean checkVeryStrongPassword(String password){
        // Create a regex string for integers, letters, and special characters
        // Compare the regex to the password to see if it contains letters, integers, and special characters
        // If not return false
        // Otherwise check the string length
        // If length is less than 8 return false
        // Otherwise return true.
        if(!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).*$")){
            return false;
        }else{
            return password.length() >= 8;
        }
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
            passwordOutput += "password of unknown strength.";
        }

        return passwordOutput;
    }
}
