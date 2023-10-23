package javaprogrammes;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (?:)
 */
public class Programme_1_TernaryOperator {

    public static void main(String[] args) {
        // input number
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // use ternary operator to check the number is odd or even
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The enter number is: " + result); // output
        scanner.close(); // scanner close
    }
}
