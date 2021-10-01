package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void testCalculateMonthsUntilPaidOffExampleValues() {
        PaymentCalculator calc = new PaymentCalculator(5000, 12, 100);
        assertEquals(70,calc.calculateMonthsUntilPaidOff());
    }

    @Test
    void testCalculateMonthsUntilPaidOffTestValues1() {
        PaymentCalculator calc = new PaymentCalculator(400, 5.5, 20);
        assertEquals(22,calc.calculateMonthsUntilPaidOff());
    }

    @Test
    void testCalculateMonthsUntilPaidOffExampleTestValues2() {
        PaymentCalculator calc = new PaymentCalculator(20000, 10, 450);
        assertEquals(56,calc.calculateMonthsUntilPaidOff());
    }

}