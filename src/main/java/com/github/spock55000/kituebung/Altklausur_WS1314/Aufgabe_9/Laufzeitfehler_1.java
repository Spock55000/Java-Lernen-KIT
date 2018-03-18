package com.github.spock55000.kituebung.Altklausur_WS1314.Aufgabe_9;

public class Laufzeitfehler_1 {
    public static void main(String[] args){
        String[] s = new String[2];
        s[0]="Hello";
        s[1]="World";
        for(int i = s.length; i>0; i--){
            System.out.println(s[2-i].toString());
        }
    }
}
