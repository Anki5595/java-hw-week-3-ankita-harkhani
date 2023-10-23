package javaprogrammes;

/**
 * 11. Write a java program to print the numbers between, 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme_11_Numbers {
    public static void main(String[] args) {
        // print number divisible by 3
        System.out.println("List of number divisible by 3 from 1 to 100:");
        numberDivisibleBy3(1); // call static method to main method to execute the programme
        System.out.println("\n_____________________________________________"); // print statement
        // print number divisible by 5
        System.out.println("List of number divisible by 5 from 1 to 100:");
        numberDivisibleBy5(1); // call static method to main method to execute the programme
    }

    //print number divisible by 3
    public static void numberDivisibleBy3(int number) {
        if (number <= 100) {
            if (number % 3 == 0) {
                System.out.println(number + " "); //print statement
            }
            numberDivisibleBy3(number + 1); // recursively call the function for the next number
        }
    }

    //print number divisible by 5
    public static void numberDivisibleBy5(int number) {
        if (number <= 100) {
            if (number % 5 == 0) {
                System.out.println(number + " ");
            }
            numberDivisibleBy5(number + 1); // recursively call the function for the next number
        }
    }
}

