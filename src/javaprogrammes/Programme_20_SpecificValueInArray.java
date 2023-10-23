package javaprogrammes;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */

public class Programme_20_SpecificValueInArray {
    public static void main(String[] args) {
        //create integers for array
        int[] value = {7, 6, 9, 5, 0, 11, 7};

        //value for check
        int targetValue = 0;

        // use boolean variable to store the result
        boolean containsValue = false;

        // loop for array to check if it contains the target value
        for (int number : value) {
            if (number == targetValue) {
                containsValue = true;
                break; // Exit the loop

            }
        }
        //print the result
        if (containsValue) {
            System.out.println("The array contain value: " + targetValue); // print statement for array contain value
        } else {
            System.out.println("The array does not contain value: " + targetValue); // print statement for array does not contain value
        }
    }
}