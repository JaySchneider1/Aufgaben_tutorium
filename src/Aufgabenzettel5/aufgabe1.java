package Aufgabenzettel5;

public class aufgabe1 {
    public static int anzahlVokale(String text) {

        text = text.toLowerCase();

        int anzahlderVokale = 0;
        for (int i = 0; i < text.length(); i++) {
            char zeichen = text.charAt(i);
            if (zeichen == 'a' || zeichen == 'e' || zeichen == 'i' || zeichen == 'o' || zeichen == 'u') {
                anzahlderVokale++;
            }
        }

        return anzahlderVokale;
    }
}
