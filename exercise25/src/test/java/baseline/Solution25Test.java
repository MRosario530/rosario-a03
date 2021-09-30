package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void checkVeryWeakPasswordValidator() {
        Solution25 app = new Solution25();

        int actual_Result = app.passwordValidator("12345");
        int expected_result = 1;
        assertEquals(expected_result,actual_Result);
    }

    @Test
    void checkWeakPasswordValidator() {
        Solution25 app = new Solution25();
        int actual_Result = app.passwordValidator("abcdef");
        int expected_result = 2;
        assertEquals(expected_result,actual_Result);
    }

    @Test
    void checkStrongPasswordValidator() {
        Solution25 app = new Solution25();
        int actual_Result = app.passwordValidator("abc123xyz");
        int expected_result = 3;
        assertEquals(expected_result,actual_Result);
    }

    @Test
    void checkVeryStrongPasswordValidator() {
        Solution25 app = new Solution25();
        int actual_Result = app.passwordValidator("1337h@xor!");
        int expected_result = 4;
        assertEquals(expected_result,actual_Result);
    }

    @Test
    void checkUnknownPasswordValidator() {
        Solution25 app = new Solution25();
        int actual_Result = app.passwordValidator("unknownPassword!");
        int expected_result = 0;
        assertEquals(expected_result,actual_Result);
    }


    @Test
    void printPasswordStrengthTest() {
        Solution25 app = new Solution25();
        String actual_Result = app.printPasswordStrength(0,"unknownPassword!");
        String expected_result = "The password 'unknownPassword!' is a password of unknown strength.";
        assertEquals(expected_result,actual_Result);
    }
}