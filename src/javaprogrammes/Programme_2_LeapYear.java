package javaprogrammes;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) { // main method
        isLeapYear(); // calling static method to main method
    }

    public static void isLeapYear() {
        int year = 2007; // enter any year

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //logic to count a leap year
            System.out.println(year + " is a leap year"); // print statement if year is a leap year
        } else {
            System.out.println(year + " is not a leap year"); // statement for year is not a leap year

        }
    }
}