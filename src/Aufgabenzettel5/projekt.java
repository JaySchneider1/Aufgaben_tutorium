package Aufgabenzettel5;

public class projekt {
    private long projektnummer;
    private long mitarbeiterID;
    private String projektname;
    private long startdatum;
    private long enddatum;

    public projekt(String projektname, long projektnummer, long mitarbeiterID, long startdatum, long enddatum) {
        this.projektname = projektname;
        setProjektnummer(projektnummer);
        this.mitarbeiterID = mitarbeiterID;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
    }

    public long getProjektnummer() {
        return projektnummer;
    }

    public void setProjektnummer(long projektnummer) {
        if(projektnummer > 0)this.projektnummer = projektnummer;
        else System.out.println("Nummer muss größer als 0 sein");
    }

    public long getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(long mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getProjektname() {
        return projektname;
    }

    public void setProjektname(String projektname) {
        this.projektname = projektname;
    }

    public long getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(long startdatum) {
        this.startdatum = startdatum;
    }

    public long getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(long enddatum) {
        this.enddatum = enddatum;
    }
    public int getDauerInTagen(){
        if (enddatum == -1){
            return (int) enddatum;
        }
        return (int) ((enddatum - startdatum)/3600);
    }

    @Override
    public String toString() {
        return "Aufgabenzettel5.projekt{" +
                "projektnummer= " + projektnummer +
                "mitarbeiterID= " + mitarbeiterID +
                "projektname=' " + projektname + '\'' +
                "startdatum= " + startdatum +
                "enddatum= " + (enddatum > 0 ? enddatum : "--" +
                "Dauer= " + getDauerInTagen()+
                '}');
    }
}
