package com.github.spock55000.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E03 {
    private LineReader reader = new LineReader();
    public void run() {
        long p = 600851475143L;
        for (long j = 2; j <= p; j++) {
            if ((p % j) == 0) {
                System.out.println(j);

                p /= j;


            }
        }
    }


}

