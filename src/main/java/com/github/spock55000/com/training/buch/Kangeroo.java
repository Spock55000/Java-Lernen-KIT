package com.github.spock55000.com.training.buch;

public class Kangeroo {
    private double schlagkraft;
    double sprungweite;

    static int counter;

    Kangeroo() {
        counter++;
        this.schlagkraft = 0.5;
    }
    Kangeroo(double schlagkraft){
        this();
        this.schlagkraft += schlagkraft;
    }

    void trainieren(){
        System.out.println("Das Känguru trainiert!");
        double r1 = Math.random();
        schlagkraft += r1;
        System.out.println("Das Känguru hat nun eine Schlagkraft von " + schlagkraft);
        double r2 = Math.random();
        sprungweite += r2;
        System.out.println("Es springt nun " + sprungweite + " Meter weit");
    }

    boolean boxen(){
        int r = (int)(Math.random() * 10);
        if (r <5) {
            System.out.println("Das Känguru haut daneben!");
            return false;
        } else {
                System.out.println("Das Känguru trifft!");
                return true;
            }
        }
    double springen(){
        if (sprungweite == 0.0){
            new Bootcamp().training(this, 1);
        }
        double sprung = 0;
        do {
            sprung = (int) (Math.random() * 10);
        } while (sprung > sprungweite);
        System.out.println("Das Känguru springt " + sprung + " Meter von maximal " + sprungweite);
        return sprung;
    }
}
