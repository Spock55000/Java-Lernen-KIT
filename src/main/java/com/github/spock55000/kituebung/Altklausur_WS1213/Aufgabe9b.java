package com.github.spock55000.kituebung.Altklausur_WS1213;

public class Aufgabe9b {
    public static void doSomething(int[] intArray){
        for(int i = 1; i<= intArray.length; i++){
            doSomethingOther(intArray[i-1]);
        }
    }
    public static void doSomethingOther(int i){
        System.out.println(1.0/i);
    }
    public static void main(String[] args){
        doSomething(new int[]{1, 2, 3});
    }
}
