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
    public Invoice genrateInvoice(int userNo, Ride[] rides,Usertype usertype) {
        CabInvoice cabInvoice = new CabInvoice();
        if(usertype.NORMAL.equals(usertype)) {
            int totalRides = rides.length;
            double aggFare = cabInvoice.calculateFare(rides);
            double avgFare = (aggFare / totalRides);
            return new Invoice(totalRides, aggFare, avgFare, userNo);
        }
        else if(usertype.PREMIUM.equals(usertype)){
            int totalRides = rides.length;
            double aggFare = cabInvoice.calculateFarePremium(rides);
            double avgFare = (aggFare / totalRides);
            return new Invoice(totalRides, aggFare, avgFare, userNo);
        }
        return null;
    }
}