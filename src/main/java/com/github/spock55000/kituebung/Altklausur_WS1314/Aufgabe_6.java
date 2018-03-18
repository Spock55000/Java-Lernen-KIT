package com.github.spock55000.kituebung.Altklausur_WS1314;

public class Aufgabe_6 {
    public static int[] searchField = {1, 2, 3, 4, 6, 7, 8, 9, 10, 35 , 62};
    public static void main(String[] args){
        printArray(searchField);
        int sN = 9;
        int index = binarySearch(0, searchField.length-1, sN);

        if(index == -1){
            System.out.println("Nummer nicht gefunden.");
        } else {
            System.out.println("Die Nummer hat den Index: " +index);
        }
    }

    public static int binarySearch(int iB, int iE, int sN){
        if ( iB > iE){
            return -1;
        }
        int iM = iB + ((iE -iB)/2);
        int result = iM;
        if(sN > searchField[iM]){
            return binarySearch(iM +1, iE, sN);
            } else if(sN < searchField[iM]){
            return binarySearch(iB, iM-1, sN);
        }
        return result;
    }
    public static void printArray(int[] tbp){
        for (int i = 0; i < tbp.length; i++){
            System.out.println(tbp[i] + " ");
        }
        System.out.println();
    }
}
