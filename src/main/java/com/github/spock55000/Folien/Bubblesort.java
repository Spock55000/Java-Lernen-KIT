package com.github.spock55000.Folien;

import com.github.spock55000.kituebung.LineReader;

public class Bubblesort {
    private LineReader reader = new LineReader();
    static int[] a = {2,5,4,3};
    public static void main(String[]args){
        bubbleSort();
    }
    private static void bubbleSort(){
        int temp = 0; boolean changedSomething = false;
        for (int i = 1; i< a.length; i++){
            for (int j = 0; j < a.length-i; j++){
                if (a[j] > a[j +1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
    }
}
