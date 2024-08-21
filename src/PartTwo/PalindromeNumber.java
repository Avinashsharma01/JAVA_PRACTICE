package PartTwo;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number that you want to check palindrone or not.....");
        int number = input.nextInt();

        int num=number;

        int reverse=0;
        while (number != 0){
            int lastNumber = number % 10;
            reverse=reverse*10+lastNumber;
            number=number/10;
        }
        if (num==reverse){
            System.out.println("This is palindrome number:-  "+ reverse);
        }else {
            System.out.println("This is just reverse number:- "+ reverse);
        }
    }
}
