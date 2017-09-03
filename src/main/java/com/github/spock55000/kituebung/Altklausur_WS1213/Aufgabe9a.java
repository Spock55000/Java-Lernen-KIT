package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe9a {
    public static void nextDivisisor(double d, int i){
        if((d%i) == 0.0){
            System.out.println(i + ", ");
        }
        if(i>0){
            nextDivisisor(d,i);
        }
    }
    public static void main(String[] args){
        double d = 42.0;
        long i = (long) d-1;
        System.out.println("Divisors of d: " + (int) d + " , ");
        nextDivisisor(d, (int) i);
    }
}
