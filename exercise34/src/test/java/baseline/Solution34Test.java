package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void testFormatEmployeeList() {
        Solution34 app = new Solution34();
        ArrayList<String> testFormat = new ArrayList<>();
        testFormat.add("Bob Jones");
        testFormat.add("James Bond");
        testFormat.add("John Cena");
        String expectedResult = "There are 3 employees:\n" +
                "Bob Jones\n" +
                "James Bond\n" +
                "John Cena\n";
        assertEquals(expectedResult,app.formatEmployeeList(testFormat).toString());
    }

    @Test
    void testRemoveEmployee() {
        Solution34 app = new Solution34();
        ArrayList<String> actualResult = new ArrayList<>();
        actualResult.add("Bob Jones");
        actualResult.add("James Bond");
        actualResult.add("John Cena");
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Bob Jones");
        expectedResult.add("James Bond");
        assertEquals(expectedResult,app.removeEmployee(actualResult,"John Cena"));
    }
}