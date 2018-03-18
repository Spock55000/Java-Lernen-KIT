/*package com.github.spock55000.kituebung.Altklausur_WS1314;

public class SortableDLList {
    CompareDLListElement head;
    CompareDLListElement tail;
    CompareDLListElement insert;
    CompareDLListElement temp;
    int size;

    public SortableDLList(){}
    public void insertFirst (Comparable obj){
        ComparableDLListElement element = new ComparableDLListElement(obj);
        head.getNext().setPrev(element);
        element.setNext(head.getNext());
        element.setPrev(head);
        head.setNext(element);
        size++;
    }
    public int size(){
        return this.size;
    }
    public void sort(){

    }
    public String toString(){
        return head.toString();
    }
}
*/