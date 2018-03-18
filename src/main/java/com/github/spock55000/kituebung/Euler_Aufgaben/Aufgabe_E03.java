package com.github.spock55000.kituebung.Euler_Aufgaben;



public class Aufgabe_E03 {
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

