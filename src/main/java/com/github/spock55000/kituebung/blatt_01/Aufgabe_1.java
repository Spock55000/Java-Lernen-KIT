package com.github.spock55000.kituebung.blatt_01;

public class Aufgabe_1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        System.out.println(x);
        System.out.println(y);
        int maxOf = (x > y) ? x : y;
        System.out.println(maxOf);
        if (x > y) {
            System.out.println("x ist größer als y und hat den Wert: " + x);
        } else {
            System.out.println("y ist größer als x und hat den Wert: " + y);
        }

    }
}
