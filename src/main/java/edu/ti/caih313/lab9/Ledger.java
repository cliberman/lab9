package edu.ti.caih313.lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ledger {

    private Double numberOfSales = 0.0;
    private Double totalSalesValue = 0.0;
    private Double averageSaleValue = 0.0;
    private Double numberOfHighValueSales = 0.0;
    private ArrayList<Double> salesList = new ArrayList<Double>();

    public void addSale(double d) { //addSale(d)—adds a sale whose value is d
        numberOfSales++;
        totalSalesValue += d;
        salesList.add(d);
    }
    public Double getNumberOfSales() { //getNumberOfSales—returns the number of sales made
        return numberOfSales;
    }
    public Double getTotalSales() { //getTotalSales—returns the total value of the sales
        return totalSalesValue;
    }
    public Double getAverageSale() { //getAverageSale()—returns the average value of all the sales
        averageSaleValue = totalSalesValue/numberOfSales;
        return averageSaleValue;
    }
    public Double getCountAbove(double v) { //getCountAbove(v)—returns the number of sales that exceeded v in value
        for(int i=0;i<salesList.size();i++) {
            if (salesList.get(i) > v) {
                numberOfHighValueSales++;
            }
        }
        return numberOfHighValueSales;
    }

    public static void main(String[] args) {
        Ledger ledger = new Ledger();
        boolean isPositive = true;
        Scanner keyboard = new Scanner(System.in);
        Double highestSale = 0.0;
        do {
            System.out.println("Enter value of sale: ");
            Double saleValue = keyboard.nextDouble();
            if (saleValue < 0) {
                isPositive = false;
            } else {
                ledger.addSale(saleValue);
            }
        } while (isPositive);
        System.out.println("Enter high value to see how many sales exceeded the value: ");
        Double v = keyboard.nextDouble();
        System.out.println("Number of sales made: " + ledger.getNumberOfSales());
        System.out.println("Average sale value: " + ledger.getAverageSale());
        System.out.println("Total value of sales: " + ledger.getTotalSales());
        System.out.println("Number of sales over the value of  " + v + ": " + ledger.getCountAbove(v));
    }
}





