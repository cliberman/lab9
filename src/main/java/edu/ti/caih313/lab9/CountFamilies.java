package edu.ti.caih313.lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountFamilies {
    public static void main(String[] args) {
        ArrayList<Double> incomeList = new ArrayList<Double>();
        boolean isPositive = true;
        Scanner keyboard = new Scanner(System.in);
        Double maxIncome = 0.0;
        do {
            System.out.println("Enter family income: ");
            Double income = keyboard.nextDouble();
            if (income < 0) {
                isPositive = false;
            } else {
                incomeList.add(income);
                if (income > maxIncome) {
                    maxIncome = income;
                }
            }
        } while (isPositive);
        //have the maxIncome, now need to count how many incomes are less than 10% of the maxIncome.
        int count = 0;
        String lowIncomes = "";
        for (int i = 0; i < incomeList.size(); i++) {
            if (incomeList.get(i) < maxIncome * .10) {
                count++;
                lowIncomes+= "\n" + incomeList.get(i);
            }
        }
        System.out.println("Largest income: " + maxIncome);
        System.out.println("Number of families with incomes less than 10% of largest income: " + count);
        if (count > 0) {
            System.out.println("Those incomes are: " + lowIncomes);
        }
    }
}
