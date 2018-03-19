package com.github.spock55000.Java_Video2Brain_7.autos.fahrzeuge;

public class Auto {
    private int geschwindigkeit;
    private String name;

    public Auto(String name, int a){
        this.name = name;
        this.geschwindigkeit=a;
    }

    public Auto(String name) {
        this(name, 0);
    }

    public Auto(int a){
        this("Unbekanntes Auto",a);
    }

    public void beschleunigen() {
        geschwindigkeit = geschwindigkeit+1;
    }
    public void setGeschwindigkeit(int a){
        this.geschwindigkeit=a;
    }

    public void bremsen() {
        geschwindigkeit = geschwindigkeit-1;
        if (geschwindigkeit < 0){
            geschwindigkeit=0;
        }
    }

    public void anhalten(){
        while (geschwindigkeit!=0){
            bremsen();
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Gibt ein Attribut von Typ int aus
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }

    public String getStatus(){
        return "Der " + name + " fährt gerade " + geschwindigkeit + " km/h.";
    }

    public void hupen(int anzahl){
        for(int i = 0; i < anzahl; i++){
            System.out.print("Hup ");
        }
        System.out.println();

    }
}
