package com.github.spock55000.kituebung.Euler_Aufgaben;

import java.util.stream.IntStream;

public class Aufgabe_E05 {
    public void run() {
        int q;
        for (q = 1; !this.isSolution(q); q++) {
        }
        System.out.println(q);


    }

    private boolean isSolution(int candidate) {
        for (int t = 1; t <= 20; t++) {
            if (candidate % t != 0) {
                return false;
            }
        }
        return true;
    }


    /*public void alternateRun() {
        int ergebnis = IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .filter(i -> IntStream.rangeClosed(1, 20).allMatch(d -> i % d == 0))
                .findFirst()
                .orElse(-1);
        System.out.println(ergebnis);
    }*/


}

