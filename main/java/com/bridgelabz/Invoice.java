package com.bridgelabz;

import java.util.Objects;

public class Invoice {
    private int totalRides;
    private double totalFare;
    private double avgFare;

    private int userNo;

    public Invoice(int totalRides, double totalFare, double avgFare, int userNo) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
        this.userNo = userNo;
    }

    public Invoice() {
    }

    public Invoice(int totalRides, double totalFare, double avgFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getAvgFare() {
        return avgFare;
    }

    public void setAvgFare(double avgFare) {
        this.avgFare = avgFare;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "totalRides=" + totalRides +
                ", totalFare=" + totalFare +
                ", avgFare=" + avgFare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice invoice)) return false;
        return totalRides == invoice.totalRides && Double.compare(invoice.totalFare, totalFare) == 0 && Double.compare(invoice.avgFare, avgFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRides, totalFare, avgFare);
    }
}
