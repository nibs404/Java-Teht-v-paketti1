package org.example;

public class Tehtava9 {
    public static String AikaMuutos(int sec) {
        int tunnit=sec/3600;
        int jaannos=sec % 3600;
        int minuutit=jaannos/60;
        int sekunnit=jaannos % 60;
        String hrString=String.format("%02d",tunnit);
        String minString=String.format("%02d",minuutit);
        String secString=String.format("%02d",sekunnit);
        return hrString+":"+minString+":"+secString;
    }
}
