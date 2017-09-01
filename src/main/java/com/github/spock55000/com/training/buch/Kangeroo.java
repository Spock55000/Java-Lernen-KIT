package com.github.spock55000.com.training.buch;

public class Kangeroo extends Mammal{
    protected double schlagkraft;
    double sprungweite;

    static int counter;

    Kangeroo() {
        bezeichnung = "Makropodidae";
        counter++;
        this.schlagkraft = 0.5;
    }
    Kangeroo(double schlagkraft){
        this();
        this.schlagkraft += schlagkraft;
    }
    public double getSprungweite(){
        return sprungweite;
    }

    void trainieren(){
        System.out.println(bezeichnung + ": Das Känguru trainiert!");
        double r1 = Math.random();
        schlagkraft += r1;
        System.out.println(bezeichnung + ": Das Känguru hat nun eine Schlagkraft von " + schlagkraft);
        double r2 = Math.random();
        sprungweite += r2;
        System.out.println(bezeichnung + ": Es springt nun " + sprungweite + " Meter weit");
    }

    boolean boxen(){
        int r = (int)(Math.random() * 10);
        if (r <5) {
            System.out.println(bezeichnung + ": Das Känguru haut daneben!");
            return false;
        } else {
                System.out.println(bezeichnung + ": Das Känguru trifft!");
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
        System.out.println(bezeichnung + ": Das Känguru springt " + sprung + " Meter von maximal " + sprungweite);
        return sprung;
    }
}
