package org.example;

public class Rent {
    double Rate(double monthlyRent, double purchaseProperty) {
        double annualRent = monthlyRent * 12;
        double yield = (annualRent / purchaseProperty) * 100;
        return yield;
    }
    public static void main(String[] args) {
        Rent r = new Rent();
        double rentYield = r.Rate(1300, 250000);
        System.out.printf("Your rental yield is %.2f", rentYield );
        System.out.print("%");
    }
}
