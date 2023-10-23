package javaprogrammes;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Programme_18_SumOfArray {

    public static void main(String[] args) {

        //declare and initialize the value of array with double
        double[] value = {23, 10.4, 21.6, 3, 7, 8, 11.7, 14.3};

        //introduce variable to store the sum
        double sum = 0;

        // by using a for loop to add each element to the sum
        for (double num : value) {
            sum += num;
        }
        System.out.println("Sum of Array: " + sum); // print statement

    }
}
