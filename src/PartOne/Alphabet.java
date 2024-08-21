package PartOne;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}


/**
 * Every character is assigned a unique integer value in the ASCII table.
 * For example:
 * 'a' has an ASCII value of 97.
 * 'z' has an ASCII value of 122.
 * 'A' has an ASCII value of 65.
 * 'Z' has an ASCII value of 90.
 * 2. Understanding Character Comparison
 * When you write an expression like c >= 'a', you are comparing the integer value of c with the integer value of 'a' (which is 97).
 */