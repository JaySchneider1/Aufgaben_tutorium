package Aufgabentyp1;

public class A1_1 {
    public static boolean istSchaltjahr(int jahr) {
        if (jahr % 4 == 0 && jahr % 100 != 0)  {
            return true;

        }

        return false;
    }
}
