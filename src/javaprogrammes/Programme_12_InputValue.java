package javaprogrammes;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12_InputValue {

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); // open scanner
        System.out.println("Enter Character (Number or Symbol or Alphabet): "); // print statement for user to enter a data
        String inputValue = scanner.next();
        scanner.close(); // close scanner

        // check that input is a single character i.e. Number or Symbol or Alphabet
        if (inputValue.length() == 1) {
            char character = inputValue.charAt(0);

            if (Character.isDigit(character)) { // check that it is a digit (number)
                System.out.println("Input is a number"); // print statement a digit or a number
            } else if (Character.isLetter(character)) {  // check that it is a letter
                System.out.println("Input is a Alphabet"); // print statement a letter
            } else {
                System.out.println("Input is a symbol"); // print a statement for a symbol
            }
        // print statement if input is invalid or enter more than onw character
        } else {
            System.out.println("Invalid input. Please enter only one character");
        }
    }
}
