package com.github.spock55000.kituebung.blatt_01;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_1 {
   private LineReader reader = new LineReader();

    public void run() {
        int x = reader.readInt("Gimme x: ");
        int y = reader.readInt("Gimme y: ");
        System.out.println("x: " + x + " y: " + y);

        int z = y;
        y = x;
        x = z;



        System.out.println("x: " + x + " y: " + y);

        int maxOf = (x > y) ? x : y;
        System.out.println(maxOf);
        if (x > y) {
            System.out.println("x ist größer als y und hat den Wert: " + x);
        } else {
            System.out.println("y ist größer als x und hat den Wert: " + y);
        }
    }


}
