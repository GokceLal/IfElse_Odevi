package org.example;

import java.util.Scanner;

/**
 * HACKERRANK If /else sorusu
 * Task
 * Given an integer perform the following conditional actions:
 *
 * If  n is odd, print Weird
 * If  n is even and in the inclusive range of  2 to 5, print Not Weird
 * If  n is even and in the inclusive range of  6 to ,20 print Weird
 * If  n is even and greater than ,20  print Not Weird
 * Complete the stub code provided in your editor to print whether or not  is weird.
 *
 * Input Format
 *
 * A single line containing a positive integer, .
 *
 * Constraints
 *
 * Output Format
 *
 * Print Weird if the number is weird; otherwise, print Not Weird.
 */
public class Runner_Ornek3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N sayısını girininz");
        int N;
        N = sc.nextInt();
        if((N>=1)&&(N<=100)){


        if(N%2==1){
            System.out.println("Weird");
        }
        if((N%2==0)&&(2<=N)&&(N<=5)){
            System.out.println("Not Weird");
        }
        if((N%2==0)&&(6<=N)&&(N<=20)){
            System.out.println("Weird");
        }
        if((N%2==0)&&(N>=20)){
            System.out.println("Not Weird");
        }
        }
        else
            System.out.println("Not Weird");

    }
}
