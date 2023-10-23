package javaprogrammes;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class Programme_19_AvgValueOfArray {
    public static void main(String[] args) {
        // create array value
        int[] value = {22, 4, 7, 6, 9, 11, 5};

        // introduce variable to store sum and the average
        int sum = 0;
        double average;

        //loop through array and add each element to sum
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }

        // calculate the average
        average = (double) sum / value.length;

        // print the average
        System.out.println("Average of array element is: " + average);

    }

}
