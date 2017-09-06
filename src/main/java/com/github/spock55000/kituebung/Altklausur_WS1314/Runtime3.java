package com.github.spock55000.kituebung.Altklausur_WS1314;

public class Runtime3 {
    public static Integer i;

    public static void doSomething(Integer i){
        System.out.println(i.toString());
        doSomethingelse(i-1);
    }
    public static void doSomethingelse(Integer j){
        System.out.println(j.toString());
        if(j>42){
            doSomething(j-1);
        }
    }
    public static void main(String[] args){
        doSomething(new Integer(42));
    }
}
