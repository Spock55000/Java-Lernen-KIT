package com.github.spock55000.com.training.buch;

public class KangerooTest {
    public static void main(String[] args){
        RockBootcamp b = new RockBootcamp();
        Kangeroo k = b.bestellen();
        System.out.println("Das Känguru hat eine maximale Sprungweite von " + k.sprungweite);
    }

}
