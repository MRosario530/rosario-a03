package baseline;

public class PaymentCalculator {
    private double balance;
    private double dailyRate;
    private double monthlyPayment;

    PaymentCalculator(double balance, double APR, double monthlyPayment){
        /* Initialize balance and monthlyPayment
                ensure that they are both rounded to 2 decimal places
           Initialize dailyRate by finding APR/365
        */
    }

    public int calculateMonthsUntilPaidOff(){
        /* Create an int numOfMonths to store the final result
            First calculate b/p to handle the need to round to nearest cent
            Afterwards plug the rounded value into the formula
            numOfMonths = -(1/30) * log(1 + b/p * (1 - (1 + dailyRate)^30)) / log(dailyRate + i)
            return numOfMonths
         */
    }
}
