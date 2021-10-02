package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void testCalculateStatisticsExampleValues() {
        Solution36 app = new Solution36();
        double[] expectedValue = {400,100,1000,353.5533905932738};
        ArrayList<Double> actualValue = new ArrayList<>();
        actualValue.add(100.0);
        actualValue.add(200.0);
        actualValue.add(300.0);
        actualValue.add(1000.0);
        assertArrayEquals(expectedValue ,app.calculateStatistics(actualValue));
    }

    @Test
    void testCalculateStatisticsTestValues() {
        Solution36 app = new Solution36();
        double[] expectedValue = {222.9266,0.5,1000.8,390.70499918767354};
        ArrayList<Double> actualValue = new ArrayList<>();
        actualValue.add(0.5);
        actualValue.add(2.0);
        actualValue.add(11.333);
        actualValue.add(100.0);
        actualValue.add(1000.8);
        assertArrayEquals(expectedValue,app.calculateStatistics(actualValue));
    }

    @Test
    void testCreateStatisticsStringExampleValues() {
        Solution36 app = new Solution36();
        double[] actualValue = {400,100,1000,353.55};
        String expectedValue = """
                The average is 400.0
                The minimum is 100
                The maximum is 1000
                The standard deviation is 353.55""";
        assertEquals(expectedValue,app.createStatisticsString(actualValue));
    }

    @Test
    void testCreateStatisticsStringTestValues() {
        Solution36 app = new Solution36();
        double[] actualValue = {222.9266,0.5,1000.8,390.70499918767354};
        String expectedValue = """
                The average is 222.93
                The minimum is 0.5
                The maximum is 1000.8
                The standard deviation is 390.7""";
        assertEquals(expectedValue,app.createStatisticsString(actualValue));
    }

}