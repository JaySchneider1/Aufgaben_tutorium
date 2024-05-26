package Aufgabenzettel5;

import java.util.ArrayList;

public class aufgabe2{
    public static ArrayList<Integer>filteremehrAls(ArrayList<Integer> zahlen, int grenze){

    ArrayList<Integer>werte=new ArrayList<>();

    for( int zahl : zahlen){
    if( zahl > grenze)
    werte.add(zahl);
    }
        return werte;
    }
}
