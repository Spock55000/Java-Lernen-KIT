package com.github.spock55000.kituebung.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E02 {
    private LineReader reader = new LineReader();

    public void run(){
        long i = 0;
        long j = 1;
        long summe=0;
        long summe2=0;
        while (summe<4000000){
            summe=i+j;
            if (summe%2==0) {
                summe2 += i + j;
            }
            i=j;
            j=summe;
            }
            System.out.println(summe2);


        }

    }

