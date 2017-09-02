package com.github.spock55000.kituebung.Euler_Aufgaben;

public class Aufgabe_E07 {
    public void run() {
        int p = 1;
        int number_of_primes = 0;
        while(number_of_primes < 10001) {
            p++;
            if (istPrimzahl(p)) {
                number_of_primes++;
            }
        }
        System.out.println(p);

    }
    private boolean istPrimzahl(int can) {
        if(can % 2 == 0 && can != 2) {
            return false;
        }

        for (int t = 3; t < can; t += 2) {
            if (can % t == 0) { //ist teilbar
                return false;
            }
        }
        return true;
        }

    }





