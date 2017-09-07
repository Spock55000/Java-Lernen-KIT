package com.github.spock55000.kituebung.Altklausur_SS2017;

public class Aufgabe_4_Boolean { //Unvollständig
        public static void main(String[] args) {
            boolean a = false;
            boolean b = false;
            boolean c = false;
            boolean d = false;

            System.out.println(a && b);
            System.out.println(c && !d);
            System.out.println((a || b)&&c);
            System.out.println(b && (a || d));
            System.out.println(b && a || d);

            if (a != !b) {
                a = false;
                c = true;
                System.out.println("Not true: " + !true);
            }

            if (false){
                System.out.println(false);

            } else if(!true){
                System.out.println(!true);

            }
            System.out.println((!a && !b) || (!a && b) || (a && b));
            System.out.println((((c)&&!b) || a) || (!a && b) || (a && b));

            if(a&&b&&c&&d){
                a = !b;
                b = !d;
                c = !c;
                d = !d;
                System.out.println("Values changed " + (a && !b && !c && d));
            }

        }
    }
