package javaprogrammes;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {

    public static void main(String[] args) { // main method
        // calling static method to main method directly
        // enter any number to check it,s odd or even
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) { // logic to verify either even or odd number
            System.out.println(number + " is even number"); // printing a statement if number is even number
        } else {
            System.out.println(number + " is odd number"); // printing a statement if number is odd number
        }
    }
}