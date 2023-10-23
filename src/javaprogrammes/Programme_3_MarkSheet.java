package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________
 */

public class Programme_3_MarkSheet {

    public static void main(String[] args) { // main method

        Scanner scanner = new Scanner(System.in); // create a scanner to read a data
        //Input student details
        System.out.println("Enter Student's Name: "); // printing a statement
        String Name = scanner.nextLine(); // going to next line
        System.out.println("Enter Roll Number: "); // printing a statement
        int rollNo = scanner.nextInt(); // going to next line
        System.out.println("Enter Math marks: "); // printing a statement
        double Math = scanner.nextDouble(); // going to next line
        System.out.println("Enter Science marks: "); // printing a statement
        double Science = scanner.nextDouble(); // going to next line
        System.out.println("Enter English marks: "); // printing a statement
        double English = scanner.nextDouble(); // going to next line

   // if the entered marks in-between 0 and 100 for each subjects
        if (Math < 0 || Math > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) { // condition given in question
            System.out.println("Invalid input, Marks should between 0 and 100"); // print a statement if data is invalid
            return; // return statement
        }

        // Calculate percentage and result
        double totalMarks = Math + Science + English;
        double percentage = (totalMarks / 300) * 100;
        // display result
        System.out.println("Percentage " + percentage); // print statement
        String result = (percentage >= 35 && Math >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail"; // used ternary operator

        // Grade calculation
        String Grade = "";
        if (percentage <= 100 && percentage >= 80) {
            Grade = "A+";
        } else if (percentage < 80 && percentage >= 60) {
            Grade = "A";
        } else if (percentage < 60 && percentage >= 50) {
            Grade = "B";
        } else if (percentage < 50 && percentage >= 35) {
            Grade = "C";
        }
        scanner.close(); // scanner closer

        //Printing a Mark sheet
        System.out.println(" ______________________________");
        System.out.println("|                              |");
        System.out.println("|            Mark Sheet        |");
        System.out.println("|______________________________|");
        System.out.println("|   Name      : " + Name + "             |");
        System.out.println("|   Roll No.  : " + rollNo + "           |");
        System.out.println("|______________________________|");
        System.out.println("|   Subjects  :        Marks   |");
        System.out.println("|______________________________|");
        System.out.println("|   Math      : " + Math + "             |");
        System.out.println("|   Science   : " + Science + "          |");
        System.out.println("|   English   : " + English + "         |");
        System.out.println("|_________________________________|");
        System.out.println("|    Total : " + totalMarks + "        | ");
        System.out.println("|_________________________________|");
        System.out.println("|    Percentage  :" + percentage + "    |");
        System.out.println("|    Result      : " + result + "|       ");
        System.out.println("|    Grade       : " + Grade + "        |");
        System.out.println("|_________________________________|");

    }

}


