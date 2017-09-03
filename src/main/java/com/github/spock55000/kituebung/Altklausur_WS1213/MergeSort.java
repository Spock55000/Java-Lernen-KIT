package com.github.spock55000.kituebung.Altklausur_WS1213;

public class MergeSort {
    static int[] tbs = {3, 7, 5, 6, 1, 0, 2, 4};
    static int[] t = new int[8];
    public static void main(String[] args) {
        mergeSort(0, tbs.length - 1);
    }
    private static void mergeSort(int lo, int hi){
        if (lo < hi){
            int m = (lo+ hi)/2;
            mergeSort(lo, m);
            mergeSort(m +1, hi);
            merge(lo, m, hi);
        }
    }
    public static void merge(int lo, int m, int hi){
        int i = lo;
        int j = m +1;
        copyToTemp(lo,hi);
        for (int k = lo; k <= hi; k++){
            if (i > m){
                tbs[k] = t[j];
                j = j +1;
            }
            else if (j > hi){
                tbs[k] = t[i];
                i = i +1;
            } else if(t[i] < t[j]){
                tbs[k] = t[j];
                j = j+1;
            }
        }
    }
    public static void copyToTemp(int lo, int hi){
        for (int k = lo; k <= hi; k++){
            t[k]=tbs[k];
        }
    }
}
