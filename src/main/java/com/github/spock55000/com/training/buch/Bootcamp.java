package com.github.spock55000.com.training.buch;

public class Bootcamp {
    void training(Kangeroo k, int anzahl){
        for (int i = 0; i < anzahl; i++){
            k.trainieren();
        }
        //anzahl = anzahl *2;
        //k.schlagkraft += 5.0;
    }
    public Kangeroo bestellen(){
        Kangeroo k = new Kangeroo();
        for (int i = 0; i < 3; i++){
            k.trainieren();
        }
        return k;

    }
}
