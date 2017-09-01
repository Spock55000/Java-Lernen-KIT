package com.github.spock55000.com.training.buch;

public class RockBootcamp extends Bootcamp{
    @Override
    public Kangeroo bestellen() {
        RockWallaby w= new RockWallaby();
        w.trainieren();
        return w;
        //return super.bestellen();
    }
}
