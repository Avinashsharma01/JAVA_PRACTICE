package PartOne;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter a character: ");
            char ch = input.next().charAt(0);
            if (ch=='0'){
                break;
            }
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch + " is a vowel");
            }else {
                System.out.println(ch + " is a consonant");
            }
        }
    }
}
