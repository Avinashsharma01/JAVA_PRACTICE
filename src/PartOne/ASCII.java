package PartOne;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        System.out.println("   ___  _   _  ___  ___ ___ ___  ___  ");
        System.out.println("  / _ \\| | | |/ _ \\/ __/ __/ _ \\/ _ \\ ");
        System.out.println(" | (_) | |_| |  __/ (_| (_|  __/ (_) |");
        System.out.println("  \\___/ \\__,_|\\___|\\___\\___\\___|\\___/ ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        int ascii = c;
        int castAscii = (int) c;
        System.out.println("The ASCII value of " + c + " is " + ascii);
        System.out.println("The ASCII value of " + c + " is " + castAscii);
    }
}
