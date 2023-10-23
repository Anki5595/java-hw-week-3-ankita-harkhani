package javaprogrammes;

/**
 * 13. Write a Java program which input any number between, 1 to 7, and it prints The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme_13_DaysInWeek {

    public static void main(String[] args) { //Main method
        int day = 5; // replace 5 with any number to get different output

        switch (day) { // switch is a keyword in java
            case 1: // case is a keyword in java
                System.out.println("Monday"); // print Monday when entered value is 1
                break; // to stop print
            case 2:
                System.out.println("Tuesday"); // print Tuesday when entered value is 2
                break;
            case 3:
                System.out.println("Wednesday"); // print Wednesday when entered value is 3
                break;
            case 4:
                System.out.println("Thursday"); // print Thursday when entered value is 4
                break;
            case 5:
                System.out.println("Friday"); // print Friday when entered value is 5
                break;
            case 6:
                System.out.println("Saturday"); // print Saturday when entered value is 6
                break;
            case 7:
                System.out.println("Sunday"); // print a Sunday when entered value is 7
                break;
            default:
                System.out.println("Week contains 1 to 7 days"); // print a statement when entered value is invalid
        }
    }
}
