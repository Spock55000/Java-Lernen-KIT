package com.github.spock55000.Folien;

public class MeinDatum {
    private int tag;
    public int monat;
    protected int jahr;

    public MeinDatum(int tag, int monat, int jahr){
        this.tag = tag;
        this. monat = monat;
        this. jahr = jahr;
        }
        static MeinDatum getHeute(){
        MeinDatum result = new MeinDatum(0,0,0);
        return result;
        }
}
