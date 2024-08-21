package PartTwo;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            for(int i=1; i<=10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }
        }
    }
}
