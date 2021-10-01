package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void testValidateInputFirstNameUnfilled() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("  ", "Jones", "12345", "AA-1234");
        assertEquals("The first name must be filled in.\n", actualInput);
    }

    @Test
    void testValidateInputLastNameUnfilled() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("Jonathan", "  ", "12345", "AA-1234");
        assertEquals("The last name must be filled in.\n", actualInput);
    }

    @Test
    void testValidateInputFirstNameNotTwoCharacters() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("J", "Jones", "12345", "AA-1234");
        assertEquals("The first name must be at least 2 characters long.\n", actualInput);
    }

    @Test
    void testValidateInputLastNameNotTwoCharacters() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("Jonathan", "J", "12345", "AA-1234");
        assertEquals("The last name must be at least 2 characters long.\n", actualInput);
    }

    @Test
    void testValidateInputEmpIDIncorrect() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("Jonathan", "Jones", "12345", "111-ABCD");
        assertEquals("The employee ID must be in the format of AA-1234.\n", actualInput);
    }

    @Test
    void testValidateInputZipCodeIncorrect() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("Jonathan", "Jones", "1234a", "AA-1234");
        assertEquals("The zipcode must be a 5 digit number.\n", actualInput);
    }

    @Test
    void testValidateInputAllCorrect() {
        Solution27 app = new Solution27();
        String actualInput = app.validateInput("Jonathan", "Jones", "12345", "AA-1234");
        assertEquals("There were no errors found.\n", actualInput);
    }
}