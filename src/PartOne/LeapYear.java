package PartOne;

import java.util.Scanner;

/**
 * The LeapYear class provides a method to determine if a given year is a leap year.
 */
public class LeapYear {
    /**
     * The main method reads a year from the user and determines if it is a leap year.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user.
        System.out.print("Enter a year: "); // Prompt the user to enter a year.
        int year = input.nextInt(); // Read the year entered by the user.

        // Check if the year is a leap year.
        // A year is a leap year if it is divisible by 4 and (not divisible by 100 or divisible by 400).
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year"); // Print that the year is a leap year.
        } else {
            System.out.println(year + " is not a leap year"); // Print that the year is not a leap year.
        }
    }
}