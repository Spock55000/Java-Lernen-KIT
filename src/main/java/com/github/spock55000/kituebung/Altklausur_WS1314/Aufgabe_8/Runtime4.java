package com.github.spock55000.kituebung.Altklausur_WS1314.Aufgabe_8;

public class Runtime4 {
    public static void main(String[] args){
        String[] s = new String[3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "!";
        for(int i = s.length; i>0; i--){
            System.out.println(s[3-i].toString());
        }

    }
}
