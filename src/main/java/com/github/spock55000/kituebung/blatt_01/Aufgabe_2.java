package com.github.spock55000.kituebung.blatt_01;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_2 {
    private LineReader reader = new LineReader();


    public void run(){
        System.out.println("Jo alda, herzlich willkommen hier, lan");
        double x = reader.readInt("Würfelseitenlänge x in cm: ");
        int m = reader.readInt("Würfelmaterial m auswählen: ");
        int plastikdichte = 920; //korrekter Wert in kg/m³
        int holzdichte = 690; //korrekter Wert in kg/m³
        int eisendichte = 7874; //korrekter Wert in kg/m³
        int bleidichte = 11342; //korrekter Wert in kg/m³
        int roh = 0;
        switch (m){
            case 1: roh = plastikdichte;
            System.out.println("Sie haben Plastik ausgewählt");
            break;
            case 2: roh = holzdichte;
            System.out.println("Sie haben Holz ausgewählt");
            break;
            case 3: roh = eisendichte;
            System.out.println("Sie haben Eisen ausgewählt");
            break;
            default: roh = bleidichte;
            System.out.println("Sie haben Blei ausgewählt");
        }
        double gewicht = ((((x*x*x)/1000000)*roh));
        // Teil D - Kraft F die der Würfel auf den Boden ausübt.
        double erdebeschl = 9.813; //genauer Wert für BaWü
        double gewichtskraft = gewicht*erdebeschl;


        //Teil E - Runden und Ausgabe
        System.out.println("Würfelgewicht = " +gewicht + " Kg");
        System.out.println("Gewichtskraft F: "+gewichtskraft+" N");

    }


}
