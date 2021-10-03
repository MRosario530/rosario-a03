package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void testDisplaySortedRecordList() {
        Solution39 app = new Solution39();
        // Since this program is specifically formatting the employee list given, I reused
        // the method to create the entire list instead of manually recreating an arraylist
        // of hashmaps again
        List<HashMap<String,String>> recordList = app.createUnsortedRecordList();
        StringBuilder actualValue = app.displaySortedRecordList(recordList);
        String expectedValue = """
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                Jacquelyn Jackson   | DBA               |
                Jake Jacobson       | Programmer        |
                John Johnson        | Manager           | 2016-12-31
                Michaela Michaelson | District Manager  | 2015-12-19
                Sally Webber        | Web Developer     | 2015-12-18
                Tou Xiong           | Software Engineer | 2016-10-05
                """;
        assertEquals(expectedValue,actualValue.toString());
    }
}