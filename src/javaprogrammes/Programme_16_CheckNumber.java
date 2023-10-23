package javaprogrammes;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Programme_16_CheckNumber {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // scanner creation
        System.out.println("Enter Number: "); // print statement to enter a data by user
        double number = scanner.nextDouble(); // going to next line
        scanner.close(); // close scanner

        // applying given condition
        if (number > 0) {
            System.out.println(number + " is POSITIVE number"); // Number is grater than 0 then result is positive number
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE number"); // Number is grater than 0 then result is negative number
        } else {
            System.out.println("This is Zero number"); // enter 0 and given statement is print

        }
    }
}

