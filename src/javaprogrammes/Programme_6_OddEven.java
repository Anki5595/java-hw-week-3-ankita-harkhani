package javaprogrammes;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {
    public static void number(double num) {
        if (num % 2 == 0) { // logic to verify either even or odd number
            System.out.println(num + " is even number"); // printing a statement if number is even number
        } else {
            System.out.println(num + " is odd number"); // printing a statement if number is odd number
        }
    }

    public static void main(String[] args) { // main method
        // calling static method to main method directly
        // enter any number to check it,s odd or even
        number(55);
        number(40);
        number(9.6);
        number(0);
        number(-10);
        number(-55);
    }
}