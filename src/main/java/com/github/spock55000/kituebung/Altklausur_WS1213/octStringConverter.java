package com.github.spock55000.kituebung.Altklausur_WS1213;

public class octStringConverter {
    public static void main (String[] args){
        String[] octString = {"123", "77", "237112", "6023", "2462"};
        int[] results = new int[octString.length];
        for(int i = 0; i < octString.length; i++){
            char[] chars = octString[i].toCharArray();
            for(char c : chars){
                results[i] = results[i]*8 + (c-'0');
            }
        }
    }
}
