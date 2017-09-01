package com.github.spock55000.com.training.buch;

public class KangerooTest {
    public static void main(String[] args){
        Kangeroo elsa;
        elsa = new Kangeroo();
        Bootcamp b = new Bootcamp();
        int anzahl = 10;
        b.training(elsa, anzahl);
        System.out.println("Trainingsanzahl = " + anzahl);
        System.out.println("Schlagkraft = " + elsa.schlagkraft);
        elsa.springen();
        elsa.boxen();
        Kangeroo gerd;
        gerd = new Kangeroo();
        for (int i = 0; i < 2; i++){
            gerd.trainieren();
        }
        gerd.springen();
        gerd.boxen();
        System.out.println("Es gibt insgesamt " + Kangeroo.counter + " Kängurus!");
    }

}
