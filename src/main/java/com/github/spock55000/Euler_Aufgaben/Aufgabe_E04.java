package com.github.spock55000.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E04 {
    private LineReader reader = new LineReader();
    public void run(){
        int i = 100;
        while (i <= 999){
            for (int j = 999; i<j; i++){
                int q = i*j;
                System.out.println(q);

            }



        }
        /*
        for (i= 100; i<=999; i++){
            for (j=100; i<1000; j++){
                int q = i*j;
                System.out.println(q);
            }


        }
        for (i = 100, j = 999; i<j; i++, j--){
            int p = i*j;
            System.out.println(p);

        }*/

    }


}
