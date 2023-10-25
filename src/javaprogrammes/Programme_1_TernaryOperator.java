package javaprogrammes;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (?:)
 */
public class Programme_1_TernaryOperator {

    public static void main(String[] args) {
        // input number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        Programme_1_TernaryOperator obj = new Programme_1_TernaryOperator();
        obj.number(number);
        scanner.close(); // scanner close
    }

        public void number(int number) {
            // use ternary operator to check the number is odd or even
            String result = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println(number + " is " + result + " number"); // output

    }
}
