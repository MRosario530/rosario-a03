package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 app = new Solution24();
        boolean actual_result = app.isAnagram("tone", "note");
        boolean expected_result = true;
        assertEquals(expected_result, actual_result);
    }

    @Test
    void alphabetSortedString(){
        Solution24 app = new Solution24();
        String actual_result = app.alphabetSortedString("tone");
        String expected_result = "enot";
        assertEquals(expected_result, actual_result);
    }
}