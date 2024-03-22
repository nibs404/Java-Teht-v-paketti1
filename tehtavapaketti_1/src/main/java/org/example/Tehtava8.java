package org.example;

public class Tehtava8 {
    public static int[] alkuLuvut(int luku) {
        int half = (int) Math.ceil(luku/2.0);
        int[] alkuluvut = new int[luku];
        int count = 0;

        for (int i=half; i<=luku; i++) {
            if (onkoAlkuluku(i)) {
                alkuluvut[count] = i;
                count++;
            }
        }
        int[] loydetytLuvut =new int[count];
        System.arraycopy(alkuluvut,0,loydetytLuvut,0,count);
        return loydetytLuvut;
    }

    public static boolean onkoAlkuluku(int luku) {
        if (luku<=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(luku); i++) {
            if (luku % i == 0) {
                return false;
            }
        }
        return true;
    }
}
