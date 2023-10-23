package javaprogrammes;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10_CalculationSymbol {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // scanner creation to read data
        System.out.println("Enter first number: "); // print statement to enter a data by user
        int firstNumber = scanner.nextInt(); // going to next line after entering a data by user
        System.out.println("Enter second number: ");  // print statement to enter a data by user
        int secondNumber = scanner.nextInt();
        System.out.println("Enter any one symbol from (+, -, *, /): ");  // print statement to enter a data by user
        char symbol = scanner.next().charAt(0); // for char keyword used .charAt(0) at end
        scanner.close(); // close scanner

        // apply condition to calculate numbers as per entered symbol by user
        double result;
        if (symbol == '+') { // condition
            result = firstNumber + secondNumber;
            System.out.println("Answer: " + result); // print result according to given condition

        } else if (symbol == '-') {
            result = firstNumber - secondNumber;
            System.out.println("Answer: " + result);

        } else if (symbol == '*') {
            result = firstNumber * secondNumber;
            System.out.println("Answer: " + result);

        } else if (symbol == '/') {
            if (secondNumber != 0) { // math logic
                result = firstNumber / secondNumber;
                System.out.println("Answer: " + result);

            } else {
                System.out.println("Division by zero is not possible"); // logic of maths
            }
        }
    }
}


