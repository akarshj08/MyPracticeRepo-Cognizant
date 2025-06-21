public class FinancialForecast 
{
    public static double predictFutureValue(double amount, double rate, int years) 
    {
        if (years == 0) 
        return amount;  
        return predictFutureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) 
    {
        double initialAmount = 10000;  
        double growthRate = 0.07;      
        int years = 5;
        double futureValue = predictFutureValue(initialAmount, growthRate, years);
        System.out.printf("Predicted Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
