package PartTwo;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println("Power calculator using while loop...");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base:- ");
        int base = input.nextInt();
        System.out.print("Enter the exponent:- ");
        int exponent = input.nextInt();
        int result=1;
        while (exponent !=0){
            result = result*base;
            exponent--;
        }
        System.out.printf("this is the power of %d is =  %d", base , result);


    }
}
