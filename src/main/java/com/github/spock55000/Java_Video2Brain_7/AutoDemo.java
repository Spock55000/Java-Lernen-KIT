package com.github.spock55000.Java_Video2Brain_7;

public class AutoDemo {
    public static void main(String[] args){
        Auto meinAuto = new Auto();  //Referenzvariable
        meinAuto.setName("Skoda");
        meinAuto.setGeschwindigkeit(48);
        meinAuto.beschleunigen();
        meinAuto.beschleunigen();
        int aktuellegeschwindigkeit = meinAuto.getGeschwindigkeit();
        System.out.println(meinAuto.getStatus());
        meinAuto.bremsen();
        System.out.println(meinAuto.getStatus());

        Auto deinAuto = new Auto();
        deinAuto.setName("Mercedes");
        deinAuto.setGeschwindigkeit(60);
        deinAuto.beschleunigen();
        deinAuto.beschleunigen();
        deinAuto.beschleunigen();
        System.out.println(deinAuto.getStatus());

    }
}
