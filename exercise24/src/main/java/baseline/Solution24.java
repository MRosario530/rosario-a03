/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        Solution24 app = new Solution24();
        // Declare 2 Strings word1 and word2
        // Ask the user to enter the strings for word1 and word2
        String word1 = app.getUserWord("Enter the first string: ");
        String word2 = app.getUserWord("Enter the second string: ");
        // Compare the two words to see if they are anagrams
        boolean result = app.isAnagram(word1, word2);
        // Print out the result
        app.printResult(result, word1, word2);

    }

    public String getUserWord(String prompt){
        // print input prompt
        System.out.print(prompt);
        // read in String data
        // return String
        return input.nextLine();
    }

    public void printResult(boolean result, String word1, String word2){
        // Create initial string
        String output = "\"" + word1 + "\" and \"" + word2 + "\" are";
        // Checks result
        // If result is false, add to the string that the words are not anagrams
        // Otherwise add that the words are anagrams
        if(!result){
            output += " not anagrams.";
        } else {
            output += " anagrams.";
        }
        // Print out the result
        System.out.println(output);
    }

    public boolean isAnagram(String word1, String word2){
        // take length of word1 and word2
        int word1Len = word1.length();
        int word2Len = word2.length();
        // if the length of both do not equal, return false
        if (word1Len != word2Len){
            return false;
        } else {
            // Use alphabetSortedString to sort both strings alphabetically
            String sortedWord1 = alphabetSortedString(word1);
            String sortedWord2 = alphabetSortedString(word2);
            // return true if the strings are equal, otherwise return false.
            return sortedWord1.equalsIgnoreCase(sortedWord2);
        }
    }

    public String alphabetSortedString(String word){
        // convert string to char array
        char[] wordArray = word.toCharArray();
        // sort char array alphabetically
        Arrays.sort(wordArray);
        // reconvert back into a string
        // return the string
        return new String(wordArray);
    }
}
