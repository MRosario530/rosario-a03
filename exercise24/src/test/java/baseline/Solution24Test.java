package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 app = new Solution24();
        boolean actual_result = app.isAnagram("tone", "note");
        boolean expected_result = true;
    }
}