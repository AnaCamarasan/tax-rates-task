package com.lloyds;

import java.util.Scanner;

public class TaxCalculator {
    public static double readUserInput () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");

        return scanner.nextDouble();
    }

    public static void calculateTax() {
        double salary = readUserInput();
        double tax = 0.0;
        double currentTax;
        StringBuilder taxBreakdown = new StringBuilder("Tax breakdown: \n");

        if (salary < 15000) {
            taxBreakdown.append("0% on ").append(salary).append(" = £0.0\n");
        } else if (salary < 20000) {
            tax = (salary - 14999) * 0.1;
            taxBreakdown.append("0% on 14999 = £0.0\n");
            taxBreakdown.append("10% on ").append(salary - 14999).append(" = £").append(String.format("%.2f", tax)).append("\n");
        } else if (salary < 30000) {
            currentTax = (salary - 19999) * 0.15;
            tax = 500 + currentTax;
            taxBreakdown.append("0% on 14999 = £0.0\n");
            taxBreakdown.append("10% on 5000 = £500.0\n");
            taxBreakdown.append("15% on ").append(salary - 19999).append(" = £").append(String.format("%.2f", currentTax)).append("\n");
        } else if (salary < 45000) {
            currentTax = (salary - 29999) * 0.2;
            tax = 2000 + currentTax;
            taxBreakdown.append("0% on 14999 = £0.0\n");
            taxBreakdown.append("10% on 5000 = £500.0\n");
            taxBreakdown.append("15% on 10000 = £1500.0\n");
            taxBreakdown.append("20% on ").append(salary - 29999).append(" = £").append(String.format("%.2f", currentTax)).append("\n");
        } else {
            currentTax = (salary - 44999) * 0.25;
            tax = 5000 + currentTax;
            taxBreakdown.append("0% on 14999 = £0.0\n");
            taxBreakdown.append("10% on 5000 = £500.0\n");
            taxBreakdown.append("15% on 10000 = £1500.0\n");
            taxBreakdown.append("20% on 15000 = £3000.0\n");
            taxBreakdown.append("25% on ").append(salary - 44999).append(" = £").append(String.format("%.2f", currentTax)).append("\n");
        }

        taxBreakdown.append("Total tax: £").append(tax);
        System.out.println(taxBreakdown.toString());
    }
}
