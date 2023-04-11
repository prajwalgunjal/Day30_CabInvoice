package com.bridgelabz;
public class RiderRepository {
    public RiderRepository() {
    }
    public Invoice genrateInvoice(int userNo, Ride[] rides) {
        CabInvoice cabInvoice = new CabInvoice();
        int totalRides=rides.length;
        double aggFare =cabInvoice.calculateFare(rides);
        double avgFare =(aggFare/totalRides);
        return new Invoice(totalRides,aggFare,avgFare,userNo);
    }

}