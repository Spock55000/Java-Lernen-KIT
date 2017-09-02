package com.github.spock55000.kituebung.Euler_Aufgaben;

public class Palindrom extends Aufgabe_E04{
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
