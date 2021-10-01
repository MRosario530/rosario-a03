package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void createHeartRateTable() {
        Solution31 app = new Solution31();
        StringBuilder expectedResult = new StringBuilder();
        StringBuilder actualResult = app.createHeartRateTable(22,65);
        expectedResult.append("Resting Pulse: 65        Age: 22\r\n" +
                "\r\n" +
                "Intensity    | Rate\r\n" +
                "-------------|--------\r\n" +
                "55%          | 138 bpm\r\n" +
                "60%          | 145 bpm\r\n" +
                "65%          | 151 bpm\r\n" +
                "70%          | 158 bpm\r\n" +
                "75%          | 165 bpm\r\n" +
                "80%          | 171 bpm\r\n" +
                "85%          | 178 bpm\r\n" +
                "90%          | 185 bpm\r\n" +
                "95%          | 191 bpm\r\n");
        assertEquals(expectedResult.toString(),actualResult.toString());
    }
}