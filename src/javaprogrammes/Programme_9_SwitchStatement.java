package javaprogrammes;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement
 */

public class Programme_9_SwitchStatement {

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char city = scanner.next().charAt(0);
        scanner.close();

//        char city = 'A'; // replace A with any alphabets to see the different result

        switch (city) { // switch statement
            case 'A': // case is a java keyword
            case 'a':
                System.out.println("Acton"); // print statement for case A
                break; // to stop the one case
            case 'B':
            case 'b':
                System.out.println("Birmingham"); // print statement for case B
                break;
            case 'C':
            case 'c':
                System.out.println("Cambridge"); // print statement for case C
                break;
            case 'D':
            case 'd':
                System.out.println("Dagenham"); // print statement for case D
                break;
            case 'E':
            case 'e':
                System.out.println("Enfield"); // print statement for case E
                break;
            case 'F':
            case 'f':
                System.out.println("Ford"); // print statement for case F
                break;
            default:
                System.out.println("Invalid entry"); // print statement for default or any other alphabets

        }
    }
}
