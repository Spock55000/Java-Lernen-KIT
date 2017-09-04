package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Stack {
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
        return size == 0;
    }

    public Object top() { //Inhalt des Oberste Elements bzw das Oberste Element
        return null;


    }

    public void push(Object kagge) { //Legt eine Element oben auf den Stapel drauf

    }

    public Object pop() { //gibt das oberste Element zurück und löscht es vom Stapel
        return null;


    }
}







