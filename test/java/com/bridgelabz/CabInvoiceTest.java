package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CabInvoiceTest {
    CabInvoice cabInvoice;
    @BeforeEach
    public void init(){
        cabInvoice = new CabInvoice();
    }
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        double fare = cabInvoice.calculateFare(20,5);
        Assertions.assertEquals(205,fare,0.0);
    }
    @Test
    public void givenDistanceAndTimeShouldReturnMinimumFare(){
        double fare = cabInvoice.calculateFare(0.2,1);
        Assertions.assertEquals(5,fare,0.0);
    }
    @Test
    public void givenMultipleRidesShouldReturnAggregateFare(){
        Ride ride = new Ride(20,5);
        Ride ride1 = new Ride(0.2,1);
        Ride ride2 = new Ride(0.5,2);
        Ride ride3 = new Ride(10,5);
        Ride[] rides ={ride,ride1,ride2,ride3};
        double aggfare = cabInvoice.calculateFare(rides);
        Assertions.assertEquals(322,aggfare);
    }
    @Test
    public void givenMultipleRidesShouldReturnInvoice(){
        Ride ride = new Ride(20,5);
        Ride ride1 = new Ride(0.2,1);
        Ride ride2 = new Ride(0.5,2);
        Ride ride3 = new Ride(10,5);
        Ride[] rides ={ride,ride1,ride2,ride3};
        Invoice expectedInvoice = new Invoice(4,322.0,322.0/4);
        Invoice invoice = cabInvoice.generateInvoice(rides);
        Assertions.assertEquals(expectedInvoice,invoice);
    }
    @Test
    public void givenUserShouldReturnInvoice(){
        Ride ride = new Ride(20,5);
        Ride ride1 = new Ride(0.2,1);
        Ride ride2 = new Ride(0.5,2);
        Ride ride3 = new Ride(10,5);
        Ride[] rides ={ride,ride1,ride2,ride3};
        RiderRepository riderRepository = new RiderRepository();
        Invoice expectedInvoice = new Invoice(4,322.0,322.0/4,1122);
        Invoice invoice=riderRepository.genrateInvoice(1122,rides);
        Assertions.assertEquals(expectedInvoice,invoice);
    }
    @Test
    public void givenPremiumUserShouldReturnInvoice(){
        Ride ride = new Ride(20,5);
        Ride ride1 = new Ride(0.2,1);
        Ride ride2 = new Ride(0.5,2);
        Ride ride3 = new Ride(10,5);
        Ride[] rides ={ride,ride1,ride2,ride3};
        RiderRepository riderRepository = new RiderRepository();
        Invoice expectedInvoice = new Invoice(4,510,510.0/4,1122);
        Invoice invoice=riderRepository.genrateInvoice(1122,rides,Usertype.PREMIUM);
        Assertions.assertEquals(expectedInvoice,invoice);
    }
}