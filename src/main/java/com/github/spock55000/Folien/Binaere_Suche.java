package com.github.spock55000.Folien;

import com.github.spock55000.kituebung.LineReader;

public class Binaere_Suche {
    public int[] suchFeld = {1,2,3,4,6,7,8,9,10,35,62}; //Feld geordnet!
    public int findeIndexBinaerRekursiv(int indexAnfang, int indexEnde, int suchNummer) {
        if (indexAnfang > indexEnde) { return -1; }
        int indexMitte = indexAnfang + ((indexEnde - indexAnfang) / 2);
        if (suchNummer > suchFeld[indexMitte]) {
            return findeIndexBinaerRekursiv(indexMitte + 1, indexEnde,suchNummer);
        } else if (suchNummer < suchFeld[indexMitte]) {
            return findeIndexBinaerRekursiv(indexAnfang, indexMitte - 1,suchNummer);
        }
        return indexMitte;

        }
    }


