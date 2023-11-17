package org.example;

public class Runner_Ornek10 {
    public static void main(String[] args) {
        String kelime ="Javailekodlama";

        int kelimeninUzunlugu = kelime.length();

        if (kelimeninUzunlugu == 0 ){

            System.out.println("Kelime uzunluğu 0 dır");

        } else if (kelimeninUzunlugu > 0 && kelimeninUzunlugu <= 5) {

            System.out.println("Kelime uzunluğu 5 ten küçüktür");

        } else if (kelimeninUzunlugu > 5 && kelimeninUzunlugu <= 10) {

            System.out.println("Kelimenin uzunluğu 5 ile 10 arasındadır");

        } else {

            System.out.println("Kelimenin uxzunluğu 10 dan büyüktür");

        }
    }
}
