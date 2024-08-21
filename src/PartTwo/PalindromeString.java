package PartTwo;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string that you want to check is palindrome...");
        String str = input.next();

        String OriginalStr= str;

        int strLength= str.length();
        String string = "";
        for (int i= strLength-1; i>=0; i--){
            string = string + str.charAt(i);
        }
        System.out.println(string);
        if (OriginalStr.equals(string)){
            System.out.println("This string is palindrome " + string);
        }else {
            System.out.println("This is just reverse string "+ string);
        }

    }
}
