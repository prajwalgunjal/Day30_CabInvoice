package com.bridgelabz;

import java.util.Arrays;

public class CabInvoice {

    public static final int COST_PER_KM = 10;
    public static final int COST_PER_MIN = 1;
    public static final int MIN_FARE = 5;


    public Double calculateFare(double distance, double time) {
        double fare=distance*COST_PER_KM+time*COST_PER_MIN;
        return fare<MIN_FARE?MIN_FARE:fare;
    }


}
