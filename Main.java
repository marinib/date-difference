package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // This is where the scanner object is created
        Scanner scanner = new Scanner(System.in);

        int year1; int year2; int month1; int month2; int day1; int day2;

        // This is where you are prompted for date1
        System.out.println("Enter the first date in format: M D Y"); //format is in US dating system M/D/Y

        // Reading the 1st input
        month1 = scanner.nextInt();
        day1 = scanner.nextInt();
        year1 = scanner.nextInt();

        // This is where  you're prompted for date2
        System.out.println("Enter the second date in format: M D Y"); //format is in US dating system M/D/Y

        // Reading the 2nd input
        month2 = scanner.nextInt();
        day2 = scanner.nextInt();
        year2 = scanner.nextInt();

        // Conversion happens here, taking a mathematical approach to the algorithm
        int date1 = (year1 * 365 + month1 * 30) + day1; //approximation, based on 365 days in a year
        int date2 = (year2 * 365 + month2 * 30) + day2;
        int difference = date2 - date1;

        // Converting to date form
        int month = (difference % 365) / 30;
        int day = (difference % 365) % 30;
        int year = difference / 356;

        // This is where it outputs the difference (changed format to US dating system M/D/Y)
        System.out.println("Difference is: " + month + " months, " + day + " days, " + year + " years.");
    }
}