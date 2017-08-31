package com.github.spock55000.com.training.buch;

public class KangerooTest {
    public static void main(String[] args){
        Kangeroo elsa;
        elsa = new Kangeroo();
        for (int i = 0; i < 3; i++){
            elsa.trainieren();
        }
        elsa.springen();
        elsa.boxen();
        Kangeroo gerd;
        gerd = new Kangeroo();
        for (int i = 0; i < 3; i++){
            gerd.trainieren();
        }
        gerd.springen();
        gerd.boxen();
    }
}
