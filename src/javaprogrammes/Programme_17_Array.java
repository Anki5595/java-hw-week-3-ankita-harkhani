package javaprogrammes;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17_Array {
    public static void main(String[] args) {
        //sorting a numeric array
        int[] numericArray = {9, 6, 15, 21, 8, 3, 13, 0, 33};
        System.out.println("Original numeric Array: " + Arrays.toString(numericArray));

        //sort the numeric array in ascending order
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending): " + Arrays.toString(numericArray));

        //sorting a string array
        String[] stringArray = {"white", "black", "red", "pink", "purple", "cream", "green", "blue"};
        System.out.println("Original string Array: " + Arrays.toString(stringArray));

        //sorting the array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));

    }
}
