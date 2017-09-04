package com.github.spock55000.Folien;

public class Motor {
    public static String englishTranslation = "engine";
    private int componentID = 123;
    int leistung;

    public Motor(int leistung) {
        this.leistung = leistung;
        System.out.println("Konstruktor in Motor");
    }
    void laufen() {System.out.println("Motor läuft");}

    protected static void benoetigterKraftstoff() {
        System.out.println("Nicht definiertr");
    }
}
