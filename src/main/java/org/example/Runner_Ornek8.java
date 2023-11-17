package org.example;

import java.util.Scanner;

public class Runner_Ornek8 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = in.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All Numbers are equal");
        } else if ((num1 == num2) || (num1 == num3) || (num3 == num2)) {
            System.out.println("Neither all are Equal or Different");
        } else {
            System.out.println("All Numbers are Different");
        }
    }
}
/**
 * is Java program prompts the user to enter three numbers and then determines whether the numbers are all equal, all different, or neither all equal nor all different.
 *
 * The program starts by importing the Scanner class, which is used to read input from the user. The main method then creates a new Scanner object and prompts the user to enter three numbers using System.out.print() and in.nextInt().
 * The program then uses a series of if statements to check whether the numbers are equal or different.
 * If all three numbers are equal, the program prints the message "All Numbers are equal" using System.out.println().
 * If any two of the numbers are equal, the program prints the message "Neither all are Equal or Different". This covers the case where two of the numbers are equal and the third is different, as well as the case where all three numbers are different.
 * Finally, if all three numbers are different, the program prints the message "All Numbers are Different".
 * Overall, this program is a simple example of how to use basic conditional statements in Java to compare and classify different values.
 */
