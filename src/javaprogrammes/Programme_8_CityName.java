package javaprogrammes;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme_8_CityName {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char city = scanner.next().charAt(0);
        scanner.close();; // close scanner

        if (city == 'A' || city =='a') {
            System.out.println("City: Acton"); // Printing statement for alphabet A
        } else if (city == 'B' || city == 'b') {
            System.out.println("City: Birmingham"); // Printing statement for alphabet B
        } else if (city == 'C' || city == 'c') {
            System.out.println("City: Cambridge"); // Printing statement for alphabet C
        } else if (city == 'D' || city =='d') {
            System.out.println("City: Dagenham"); // Printing statement for alphabet D
        } else if (city == 'E' || city == 'e') {
            System.out.println("City: Enfield"); // Printing statement for alphabet E
        } else if (city == 'F' || city == 'f') {
            System.out.println("City: Ford"); // Printing statement for alphabet F
        } else {
            System.out.println("Invalid entry"); // // Printing statement for any other alphabet
        }
    }
}

