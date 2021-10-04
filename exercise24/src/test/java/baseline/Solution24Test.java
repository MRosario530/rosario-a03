package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void testIsAnagram() {
        Solution24 app = new Solution24();
        boolean actual_result = app.isAnagram("tone", "note");
        boolean expected_result = true;
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testCreateResultString() {
        Solution24 app = new Solution24();
        String actualResult = app.createResultString(true,"note","tone");
        String expectedResult = "\"note\" and \"tone\" are anagrams.";
        assertEquals(expectedResult,actualResult);
    }

}