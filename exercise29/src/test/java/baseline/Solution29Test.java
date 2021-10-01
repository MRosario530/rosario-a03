package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void calculateDoubleInvestmentWholeNumberResult() {
        Solution29 app = new Solution29();
        assertEquals(9, app.calculateDoubleInvestment(8));
    }

    @Test
    void calculateDoubleInvestmentDecimalNumberResult() {
        Solution29 app = new Solution29();
        assertEquals(8, app.calculateDoubleInvestment(10));
    }
}