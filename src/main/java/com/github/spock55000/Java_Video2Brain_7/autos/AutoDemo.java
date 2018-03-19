package com.github.spock55000.Java_Video2Brain_7.autos;
import com.github.spock55000.Java_Video2Brain_7.autos.fahrzeuge.*;

public class AutoDemo {
    public static void main(String[] args){
        Auto[] autos = new Auto[3];

       autos[0] = new Auto("Skoda", 48);  //Referenzvariable
        autos[0].beschleunigen();
        autos[0].beschleunigen();
        int aktuellegeschwindigkeit = autos[0].getGeschwindigkeit();
        System.out.println(autos[0].getStatus());
        autos[0].bremsen();
        autos[0].bremsen();
        autos[0].bremsen();
        System.out.println(autos[0].getStatus());
        autos[0].anhalten();

        autos[1] = new Auto("Mercedes", 60);
        autos[1].beschleunigen();
        autos[1].beschleunigen();
        autos[1].beschleunigen();

        autos[2] = new Auto("BMW", 160);
        autos[2].beschleunigen();
        autos[2].beschleunigen();
        autos[2].beschleunigen();
        autos[2].hupen(10);

        for(int i = 0; i < autos.length; i++){
            System.out.println(autos[i].getStatus());
        }

    }
}
