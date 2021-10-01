package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void testAddFiveNumbersUsingInts() {
        Solution28 app = new Solution28();
        double[] list = {1, 2, 3, 4, 5};
        double total = app.addFiveNumbers(list);
        assertEquals(15.0,total);
    }

    @Test
    void testAddFiveNumbersUsingDecimals() {
        Solution28 app = new Solution28();
        double[] list = {1.5, 2.5, 3.5, 4.5, 5.5};
        double total = app.addFiveNumbers(list);
        assertEquals(17.5,total);
    }

    @Test
    void testAddFiveNumbersUsingNegatives() {
        Solution28 app = new Solution28();
        double[] list = {1, -1, 2, -2, 3};
        double total = app.addFiveNumbers(list);
        assertEquals(3.0,total);
    }


}