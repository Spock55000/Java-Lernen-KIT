package com.github.spock55000.kituebung.Euler_Aufgaben;



public class Aufgabe_E06 {

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
        int diff = (summe*summe)-qs;
        System.out.println("Die Differenz des Quadrats der Summe " +summe + " und von der Summe der Quadrate " + qs + " beträgt " +diff+ ".");
    }
}
