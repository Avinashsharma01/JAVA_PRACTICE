package PartTwo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :- ");
        int number = input.nextInt();

        boolean flag = false;

        if (number==1 || number==0){
            flag = true;
        }

        for(int i=2; i<=number/2; i++){
            if (number % i==0){
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(number + " is prime number ");
        else
            System.out.println(number + " is not prime number");

    }
}
