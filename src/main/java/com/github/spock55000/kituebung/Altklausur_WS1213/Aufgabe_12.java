package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe_12 {
    public static void method(char[][] c){
        if(c.length >= c[0].length){
            for(int  i = 0; i < c[0].length; i++){
                c[i][i]= '*';
                c[i][c[0].length-1-i] = '*';
            }

        }else {
            for(int i = 0; i<c.length; i++){
                c[i][i]= '*';
                c[c[0].length-1-i][i] = '*';
            }
        }
    }
}
