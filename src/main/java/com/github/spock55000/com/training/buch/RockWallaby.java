package com.github.spock55000.com.training.buch;

public class RockWallaby extends Kangeroo {
    @Override
    void trainieren() {
        schlagkraft += Math.random() *2;
        sprungweite += Math.random() *0.5;
        System.out.println("Ich bin ein trainiertes Felskänguru.");
        //super.trainieren();
    }
}
