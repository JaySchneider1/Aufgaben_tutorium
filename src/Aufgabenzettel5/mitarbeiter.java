package Aufgabenzettel5;

import java.util.ArrayList;

public class mitarbeiter {
    private String name;
    private String abteilung;
    private long gehalt;
    private ArrayList<projekt> projekte;

    public mitarbeiter(String name, String abteilung, long gehalt, ArrayList<projekt> projekte) {
        this.name = name;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
        this.projekte = new ArrayList<>();
    }

    public boolean addProjekt(projekt projekt) {
        for (projekt z : projekte) {
//Artur hänge hier... hast du einen Tipp?
        }
    }
}
