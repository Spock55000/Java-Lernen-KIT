package com.github.spock55000.kituebung.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E05 {
    private LineReader reader = new LineReader();
    public void run(){
        int n;
        int d;
        int qs = 0;
        int sq = 0;
        int summe = 0;
        for (n = 1; n<= 100; n++){
            qs += n*n;

        }
        for (d = 1; d<=100; d++){

            summe+=d;



        }
        System.out.println(summe);
        int diff = qs - summe;
        System.out.println("Die Differenz von der Summe der Quadrate " + qs + " und des Quadrats der Summe " +summe + " beträgt " +diff+ ".");


    }
}
