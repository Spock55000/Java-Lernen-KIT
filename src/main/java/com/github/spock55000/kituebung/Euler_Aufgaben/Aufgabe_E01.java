package com.github.spock55000.kituebung.Euler_Aufgaben;



public class Aufgabe_E01 {

    public void run(){
        long summe=0;
        for (int i = 0; i<1000;i++){
          int d = i%3;
          int f = i%5;
          if ((d==0 || f==0)){
              summe+=i;
          }

        }

        System.out.println(summe);


    }


}
