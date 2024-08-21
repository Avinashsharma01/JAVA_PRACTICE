package PartOne;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // ax^2 + bx + c = 0
        // x = (-b ± √(b^2-4ac)) / (2a)
        double root1, root2;
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else {
            double sqrt = Math.sqrt(discriminant);
            double denominator = 2 * a;

            root1 = (-b + sqrt) / denominator;
            root2 = (-b - sqrt) / denominator;

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}