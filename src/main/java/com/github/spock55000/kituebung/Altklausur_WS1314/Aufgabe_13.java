package com.github.spock55000.kituebung.Altklausur_WS1314;

public class Aufgabe_13 {
    public static void method(char[][] c){
        boolean s = true, z = true, b = true;
        int i = 0, j = 0, k = 0;
        while (b){
            k = k+1;
            c[i][j] = '*';
            if (z)      i = i +1;
            else        i = i-1;
            if (s)      j=j+1;
            else        j = j-1;
            if(i == 0)                z=true;
            if(i == c.length-1)       z = false;
            if(j == 0)                s=true;
            if(j == c[0].length-1)   s=false;
            if(k > (c.length*c[0].length)|| k > 100) b = false;
        }
    }
}
