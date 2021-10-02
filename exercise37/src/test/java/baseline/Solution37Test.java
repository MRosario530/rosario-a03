package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void testGeneratePasswordLength() {
        Solution37 app = new Solution37();
        ArrayList<Character> test = new ArrayList<>();
        int[] testConstraints = {8,2,2};
        boolean actualValue = true;
        for(int i = 0; i < 10; i++){
            test = app.generatePassword(testConstraints);
            if (test.size() < 8){
                actualValue = false;
            }
        }
        assertTrue(actualValue);
    }

    @Test
    void testGeneratePasswordSymbolCount() {
        Solution37 app = new Solution37();
        int[] testConstraints = {8,4,0};
        ArrayList<Character> test = app.generatePassword(testConstraints);
        int actualValue = 0;
        String symbols = "!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for (int i= 0; i < symbols.length(); i++) {
            for (Character character : test) {
                if (symbols.charAt(i) == character) {
                    actualValue++;
                }
            }
        }
        assertEquals(4,actualValue);
    }

    @Test
    void testGeneratePasswordNumberCount() {
        Solution37 app = new Solution37();
        int[] testConstraints = {8,0,2};
        ArrayList<Character> test = app.generatePassword(testConstraints);
        String numbers = "0123456789";
        int actualValue = 0;
        for (int i= 0; i < numbers.length(); i++) {
            for (Character character : test) {
                if (numbers.charAt(i) == character) {
                    actualValue++;
                }
            }
        }
        assertEquals(2,actualValue);
    }

    @Test
    void testGeneratePasswordLetterCount() {
        Solution37 app = new Solution37();
        int[] testConstraints = {8,0,0};
        ArrayList<Character> test = app.generatePassword(testConstraints);
        boolean actualValue = false;
        int charCount = 0;
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i= 0; i < letters.length(); i++) {
            for (Character character : test) {
                if (letters.charAt(i) == character) {
                    charCount++;
                }
            }
        }
        if (charCount >= 8) {
            actualValue = true;
        }
        assertTrue(actualValue);
    }

    @Test
    void testConstructPasswordString() {
        Solution37 app = new Solution37();
        ArrayList<Character> test = new ArrayList<>();
        test.add('a');
        test.add('b');
        test.add('c');
        test.add('1');
        test.add('2');
        test.add('3');
        StringBuilder actualValue = app.constructPasswordString(test);
        assertEquals("abc123",actualValue.toString());
    }
}