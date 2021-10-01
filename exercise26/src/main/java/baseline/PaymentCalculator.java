package baseline;

public class PaymentCalculator {
    private double balance;
    private double dailyRate;
    private double monthlyPayment;

    PaymentCalculator(double balance, double apr, double monthlyPayment){
        // Initialize balance and monthlyPayment
        // ensure that they are both rounded to 2 decimal places
        this.balance = Math.round(balance * 100.0) / 100.0;
        this.monthlyPayment = Math.round(monthlyPayment * 100.0) / 100.0;
        // Initialize dailyRate by converting apr to a decimal and dividing by 365
        this.dailyRate = (apr/100.00)/365.00;
    }

    public int calculateMonthsUntilPaidOff(){
        // Store the parts of the formula: -(1/30) * log(1 + b/p * (1 - (1 + dailyRate)^30)) / log(dailyRate + i)
        // into 3 parts - The constant at the beginning, the numerator, and the denominator
        // Calculate them separately and then return the completed result
        double constant = -(1.0/30.0);
        // First calculate b/p to handle the need to round to the nearest cent, then proceed with the rest of the math
        double numerator = Math.round((balance/monthlyPayment) * 100.0) / 100.0;
        numerator = Math.log(1 + numerator * ( 1 - Math.pow(1 + dailyRate, 30)));
        double denominator = Math.log(1 + dailyRate);
        // Return the number of months rounded up to the next total month
        return (int)Math.ceil(constant * numerator / denominator);
    }
}
