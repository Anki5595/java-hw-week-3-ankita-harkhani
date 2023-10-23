package javaprogrammes;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme_8_CityName {

    public static void main(String[] args) { // main method
        char city = 'A'; // replace A with any alphabet.

        if (city == 'A') {
            System.out.println("City: Acton"); // Printing statement for alphabet A
        } else if (city == 'B') {
            System.out.println("City: Birmingham"); // Printing statement for alphabet B
        } else if (city == 'C') {
            System.out.println("City: Cambridge"); // Printing statement for alphabet C
        } else if (city == 'D') {
            System.out.println("City: Dagenham"); // Printing statement for alphabet D
        } else if (city == 'E') {
            System.out.println("City: Enfield"); // Printing statement for alphabet E
        } else if (city == 'F') {
            System.out.println("City: Ford"); // Printing statement for alphabet F
        } else {
            System.out.println("Invalid entry"); // // Printing statement for any other alphabet
        }
    }
}

