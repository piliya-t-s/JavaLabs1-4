package ru.mirea.lab3.format.ex12;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToUSD(double amount) {
        return amount / exchangeRate;
    }

    public double convertFromUSD(double amount) {
        return amount * exchangeRate;
    }
}

