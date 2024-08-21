package PartOne;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend, divisor = 4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        dividend = input.nextInt();
        System.out.println("Enter the divisor: ");
        divisor = input.nextInt();


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
