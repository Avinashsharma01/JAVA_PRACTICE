package PartTwo;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse program!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number that you want to reverse: ");
        int number = input.nextInt();

        int reverse=0;
        while (number !=0){
            int digit = number % 10;
            reverse=reverse * 10+digit;
            number =number/10;
        }

        System.out.println("This is the reverse:- " + reverse);
    }
}
