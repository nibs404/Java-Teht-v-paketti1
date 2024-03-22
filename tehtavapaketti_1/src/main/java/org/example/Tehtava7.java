package org.example;

public class Tehtava7 {
    public static int FiboKaava(int n) {
        if (n<=1) {
            return n;
        } else {
            int a=0,b=1,tulo= 0;
            for (int i=2; i<n; i++) {
                tulo =a+b;
                a=b;
                b=tulo;
            }
            return tulo;
        }
    }
}
