package com.github.spock55000.kituebung.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E04 {
    private LineReader reader = new LineReader();
    public void run(){
        int i = 100;
        int max = 999*999;
        for (int q = 0; q <= max;i++){
            for (int j = 999; q <= max; j--){
                q = i*j;
                if (max < q && Palindrom(q)){
                    max = q;
                    String s = Integer.toString(q);
                    int index = s.length();
                    int [] var = new int [index];
                    for (int z = 0; z <= index; z++){
                        if (var[z] != var[s.length()-1]){
                            return false;
                        }
                        return true;

                    }



                }
            }
        }
        System.out.println(max);
    }
}
