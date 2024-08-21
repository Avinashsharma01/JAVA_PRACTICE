package Experiment;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string:- ");
        String str = input.next();

        System.out.println(str.charAt(0));
    }
}
