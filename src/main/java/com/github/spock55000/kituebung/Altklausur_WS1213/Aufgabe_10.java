package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe_10 {
    private static PocketMonster monster1, monster2;
    public static void main(String[] args){
        monster1 = new PsychoMon("Mew");
        monster2 = new ElectricRat("Raichu");
        System.out.println("Fight: " + monster1.name + " VS. " + monster2.name);
        monster1.attack(monster2);
        monster2.attack(monster1);
    }
}

class PocketMonster {
    public  int level;
    private int hp;
    String name = "unknown";

    protected  PocketMonster(String name){
        this.name = name;
        System.out.println("Creating Monster:" + name);
    }
    public  PocketMonster(){}

    void attack(PocketMonster a){
        System.out.println("Attacking :" + a.name);
    }
}
