package ru.itpark;

public class CreditService {
    public double creditCalculator (double creditAmount, double interestRate,double  creditData) {
        double initialNumber = 1;
        double amountMonthsYear = 12;

        double monthlyInterestRate = initialNumber + (interestRate / 100 / amountMonthsYear);
        monthlyInterestRate = Math.pow(monthlyInterestRate,creditData);

        double  totalAmount =  creditData * ((creditAmount * interestRate / 100 / amountMonthsYear) +
                ((creditAmount * interestRate / 100 / amountMonthsYear) / (monthlyInterestRate - initialNumber)));
        int redemptionAmount = (int) (totalAmount);

        return redemptionAmount;

    }
}
