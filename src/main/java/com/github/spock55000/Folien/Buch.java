package com.github.spock55000.Folien;

public class Buch {
    private Kapitel[] kapitel = new Kapitel[100];
    private int anzhahlBisherigerKapitel = 0;
    public void kapitelHinzufuegen(){
        kapitel[anzhahlBisherigerKapitel] = new Kapitel(this);
        anzhahlBisherigerKapitel++;
    }
}

class Kapitel{
    private Buch vonBuch;
    public Kapitel(Buch buch){
        if (buch == null){throw new NullPointerException();}
        this.vonBuch = buch;
    }
}
