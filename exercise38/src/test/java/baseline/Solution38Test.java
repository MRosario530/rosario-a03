package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void testFilterEvenNumbersExampleSample() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("1 2 3 4 5 6 7 8");
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testFilterEvenNumbersOnlyWords() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("ah man i forgot the numbers");
        ArrayList<Integer> expectedResult = new ArrayList<>();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testFilterEvenNumbersBlank() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("");
        ArrayList<Integer> expectedResult = new ArrayList<>();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testFilterEvenNumbersNumbersFromNegativeToPositive10() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("-10 -5 0 5 10");
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(-10);
        expectedResult.add(10);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testFilterEvenNumbersNumbersAndWords() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("wow 1 i 2 didnt 4 get 2 the numbers");
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testCreateArrayListString() {
        Solution38 app = new Solution38();
        ArrayList<Integer> actualResult = app.filterEvenNumbers("1 2 3 4 5 6 7 8");
        String expectedResult = "The even numbers are 2 4 6 8 .";
        assertEquals(expectedResult, app.createArrayListString(actualResult).toString());

    }
}