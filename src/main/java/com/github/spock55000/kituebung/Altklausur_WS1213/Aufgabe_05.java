package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe_05 {
    public ListElementDL begin;
    public ListElementDL end;
    public int size;

    public Stack() {
        begin = new ListElementDL(null);
        end = new ListElementDL(null);
        begin.setNext(end);
        end.setPrev(begin);
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        return "(" + begin.getNext().toString() + ")";
    }


    public boolean isEmpty (){
        return this.isEmpty();



    }

    top() {


    }

    public void push() {

    }

    pop() {


    }*/
}







