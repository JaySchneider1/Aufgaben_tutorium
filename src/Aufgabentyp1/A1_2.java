package Aufgabentyp1;

public class A1_2 {
    public static int summeDerQuadrate(int n) {
        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += i * i;
        }
        return summe;
    }
}
