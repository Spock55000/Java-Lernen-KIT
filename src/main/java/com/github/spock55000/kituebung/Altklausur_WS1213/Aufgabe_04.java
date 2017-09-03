package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe_04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        System.out.println(a || b);
        System.out.println(!c && !d);
        if (a == b) {                  // unnötig, da a ungleich b ist und damit der Block ignoriert wird
            c = true;
            a = b;
            System.out.println("Not true: " + !true);
        }

        System.out.println((a || b)&&c);
        System.out.println(b && (a || d));
        System.out.println(b && a || d);

        if (false){
            System.out.println(false);

        } else if(!true){
            System.out.println(!true);

        } else {
            System.out.println(!(a&&b));
        }
        System.out.println((!a && !b || (!a && b) || (a && b)));


        if(a||b||c||d){ // immer wahr
            a = !b; //true
            b = !c; //true
            c = !c; //true
            d = !d; //false
            System.out.println("Values changed " + (a && !b && !c && d));
        }
        System.out.println((a && !c) || (!a && d));
        System.out.println((a||b) && (!c || !d));


    }

}
