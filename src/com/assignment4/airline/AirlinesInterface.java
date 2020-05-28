package com.assignment4.airline;

public interface AirlinesInterface {
    double calculateFuelExpense();
    boolean canTransportCargo();
    default double calculateProfitability()
    {
        return 0;
    }
}
