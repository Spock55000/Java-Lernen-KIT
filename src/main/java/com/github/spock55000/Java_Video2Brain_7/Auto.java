package com.github.spock55000.Java_Video2Brain_7;

public class Auto {
    private int geschwindigkeit;
    private String name;

    public void beschleunigen() {
        geschwindigkeit = geschwindigkeit+1;
    }
    public void setGeschwindigkeit(int a){
        this.geschwindigkeit=a;
    }

    public void bremsen() {
        geschwindigkeit = geschwindigkeit-1;
    }

    public void hupen(int a){
        System.out.println("Es wurde " +a +"mal gehupt!");
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
}
