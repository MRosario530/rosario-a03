package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    //@Test
    //void passwordValidator() {
    //}

    @Test
    void checkVeryWeakPasswordTest() {
        Solution25 app = new Solution25();

        boolean actual_Result = app.checkVeryWeakPassword("12345");
        assertTrue(actual_Result);
    }

    @Test
    void checkWeakPasswordTest() {
        Solution25 app = new Solution25();

        boolean actual_Result = app.checkWeakPassword("abcdef");
        assertTrue(actual_Result);
    }


    @Test
    void checkStrongPasswordTest() {
        Solution25 app = new Solution25();

        boolean actual_Result = app.checkStrongPassword("abc123xyz");
        assertTrue(actual_Result);
    }

    @Test
    void checkVeryStrongPasswordTest() {
        Solution25 app = new Solution25();

        boolean actual_Result = app.checkVeryStrongPassword("1337h@xor");
        assertTrue(actual_Result);
    }
    /*
    @Test
    void printPasswordStrengthTest() {
    } */
}