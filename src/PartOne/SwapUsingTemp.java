package PartOne;

import java.util.Scanner;

public class SwapUsingTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Before swapping:============================ ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        int temp;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("After swapping:============================ ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
