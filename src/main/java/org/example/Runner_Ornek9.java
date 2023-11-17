package org.example;

import java.util.Scanner;

public class Runner_Ornek9 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age >= 18) {
            System.out.println("Oy kullanabilirsin");

        }
        else if(age < 18)
            System.out.println("Oy kullanamassın");
        else
        System.out.println("Geçerli bir yaş giriniz");
    }
}
