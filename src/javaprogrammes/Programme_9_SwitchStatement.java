package javaprogrammes;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement
 */

public class Programme_9_SwitchStatement {

    public static void main(String[] args) { //main method
        char city = 'A'; // replace A with any alphabets to see the different result

        switch (city) { // switch statement
            case 'A': // case is a java keyword
                System.out.println("Acton"); // print statement for case A
                break; // to stop the one case
            case 'B':
                System.out.println("Birmingham"); // print statement for case B
                break;
            case 'C':
                System.out.println("Cambridge"); // print statement for case C
                break;
            case 'D':
                System.out.println("Dagenham"); // print statement for case D
                break;
            case 'E':
                System.out.println("Enfield"); // print statement for case E
                break;
            case 'F':
                System.out.println("Ford"); // print statement for case F
                break;
            default:
                System.out.println("Invalid entry"); // print statement for default or any other alphabets

        }
    }
}
