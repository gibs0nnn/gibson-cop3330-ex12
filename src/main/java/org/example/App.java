package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = scanner.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        double realRate = rate / 100;
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        //Conversion
        double interest = (principal * realRate) * years;
        double total = principal + interest;

        //Output
        if(total % 1 != 0) {
            System.out.println("After " + years + " years at " + rate + "% the investment will be worth $" +
                    (Math.round(total * 100.0) / 100.0) + ".");
        } else {
            System.out.println("After " + years + " years at " + rate + "% the investment will be worth $" +
                    (int) total + ".");
        }

    }
}
