package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void testFindSearchedEmployees() {
        Solution40 app = new Solution40();
        // Reusing this method from Solution40 in order to easily generate the list of employees to test
        List<HashMap<String,String>> recordList = app.createRecordList();
        StringBuilder actualResult = app.findSearchedEmployees(recordList,"Jac");
        String expectedResult = """
                Results:

                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                Jacquelyn Jackson   | DBA               |
                Jake Jacobson       | Programmer        |
                """;
        assertEquals(expectedResult,actualResult.toString());
    }
}