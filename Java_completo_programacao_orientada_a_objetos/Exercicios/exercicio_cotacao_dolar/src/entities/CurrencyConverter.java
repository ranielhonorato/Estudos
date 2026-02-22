package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double reaisToPay(double amountDollar, double dollarPrice){
        return amountDollar *  dollarPrice * (1.0 + IOF);
    }

}
