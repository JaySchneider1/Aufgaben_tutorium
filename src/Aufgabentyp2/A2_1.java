package Aufgabentyp2;

import java.util.ArrayList;
import java.util.List;

public class A2_1 {
    public class ZahlFilter {
        public static List<Integer> filtereGeradeZahlen(List<Integer> zahlen) {
            List<Integer> geradeZahlen = new ArrayList<>();
            for (Integer zahl : zahlen) {
                if (zahl % 2 == 0) {
                    geradeZahlen.add(zahl);
                }
            }
            return geradeZahlen;
        }

    }
}
