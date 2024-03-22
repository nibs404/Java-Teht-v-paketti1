package org.example;

public class Tehtava6 {
    public static boolean onPalindrome(String s) {
        s = s.replaceAll("\\s", "").toLowerCase();
        int i = 0;
        int x = s.length() - 1;

        while (i < x) {
            if (s.charAt(i) != s.charAt(x)) {
                return false;
            }
            i++;
            x--;
        }
        return true;
    }
}
