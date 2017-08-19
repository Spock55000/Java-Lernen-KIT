package com.github.spock55000.kituebung.blatt_01;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_2 {
    private LineReader reader = new LineReader();


    public void run(){
        System.out.println("Jo alda, herzlich willkommen hier, lan");
        int x = reader.readInt("Würfelseitenlänge x in cm: ");
        int m = reader.readInt("Würfelmaterial m auswählen: ");
        int plastikdichte = 5;
        int holzdichte = 15;
        int eisendichte = 25;
        int restdichte = 10000;
        int roh = 0;
        switch (m){
            case 1: roh = plastikdichte;
            break;
            case 2: roh = holzdichte;
            break;
            case 3: roh = restdichte;
            break;
            default: roh = restdichte;
        }
        float gewicht = (((x*x*x)/1000)*roh)/1000;
        System.out.println("Würfelgewicht = " +gewicht + " Kg");
    }


}
