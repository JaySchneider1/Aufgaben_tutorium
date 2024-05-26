package Aufgabentyp1;

public class A1_3 {
    public static boolean istPrimzahl(int zahl) {
        if (zahl <= 1) {
            return false;
        }
        for (int teiler = 2; teiler <= Math.sqrt(zahl); teiler++) {
            if (zahl % teiler == 0) {
                return false;
            }
        }
        return true;
    }
}
