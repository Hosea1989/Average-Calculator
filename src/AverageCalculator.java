/*
 *  Assignment: Project 1
 *  Description: This is an Average Calculator. It accepts 3 whole numbers and
 *               it display the 3 digits, followed by the average of the 3 numbers.
 *  Name: Damien Hosea
 *  ID: 921395901
 *  Class: CSC 210-07
 *  Semester: Fall 2020
 */

import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        //I am using the scanner to allow me to accept inputs from the keyboard.
        Scanner input = new Scanner(System.in);


        System.out.println(" Welcome to the Average Calculator ");
        System.out.println("Please enter 3 whole numbers: ");

        int firstDigit = input.nextInt(); // <- I declared 3 ints, one for each digit.
        int secondDigit = input.nextInt();
        int thirdDigit = input.nextInt();

        //This print statement will printout all 3 of the digits back to the user.
        System.out.print("The 3 numbers are " + firstDigit + " " + secondDigit + " " + thirdDigit + " and " );

        // vv Here I am getting the average of the 3 numbers by digits them by the amount of digits there are.
        int average = ( firstDigit + secondDigit + thirdDigit)/3;

        //This last statement will output the average to the user. 
        System.out.println("the Average of your 3 numbers is: " + average);


    }
}
