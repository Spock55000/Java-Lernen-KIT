package com.github.spock55000.kituebung.Altklausur_WS1314;

public class Aufgabe_04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        System.out.println(!a);System.out.println(" - ");
        System.out.println(a && b);System.out.println(" - ");
        System.out.println(!c || !d);System.out.println(" - ");

        System.out.println((a || b) && c);System.out.println(" - ");
        System.out.println(b && a || !d);System.out.println(" - ");

        if (a == !d) {
            c = false;
            d = true;
            System.out.println("Not true: " + !true);System.out.println(" - ");
        }

        if (false){
            System.out.println(false);System.out.println(" - ");

        } else if(!true){
            System.out.println(!true);System.out.println(" - ");

        }

        System.out.println((!a && !b) || (!a && b) || (a && b));
        System.out.println(" - ");

        System.out.println((a && !c) || (!a && d)); System.out.println(" - ");
        System.out.println((a || b) && !(!c || !d)); System.out.println(" - ");


        if(a||!b||c||!d){ // immer wahr
            a = !b;
            b = !c;
            c = !c;
            d = !d;
            System.out.println("Values changed " + a);
            System.out.println(" - ");
        }

    }
}
