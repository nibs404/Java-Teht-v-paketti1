package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("tehtävä 1:");
        //Tehtävä 1:
        double distance = Tehtava1.Distance(1, 2, 0, 3);
        System.out.println("Välimatka pisteiden välillä: "+ distance);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 2:");
        //Tehtävä 2:
        System.out.println(" ");
        Tehtava2.printTriangles(3);
        System.out.println(" ");
        Tehtava2.printTriangles(5);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();


        System.out.println("tehtävä 3:");
        //Tehtävä 3;
        double ympyranPintaAla = Tehtava3.Circle(6);
        System.out.println("Ympyrän pinta-ala on: "+ympyranPintaAla);
        double nelionPintaAla = Tehtava3.Square(4);
        System.out.println("Neliön pinta-ala on: "+nelionPintaAla);
        double kolmionPintaAla = Tehtava3.Triangle(3, 4);
        System.out.println("Neliön pinta-ala on: "+kolmionPintaAla);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 4:");
        //Tehtävä 4;
        int[][] matrix = {
                {1, 5, 7},
                {9, 3, 1},
                {0, 1, 1}
        };

        int[] indeksi = Tehtava4.BiggestIndex(matrix);
        System.out.println("Suurimman arvon indexi: '["+indeksi[0]+","+indeksi[1]+"]'");
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 6:");
        //Tehtävä 6;
        String s = "Saippuakauppias";
        System.out.println(s + " onko palindromi: "+Tehtava6.onPalindrome(s));
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 7:");
        //Tehtävä 7;
        int n=4;
        int fibnum = Tehtava7.FiboKaava(n);
        System.out.println("Fibonacci-sarjan "+n+":s luku on: "+fibnum);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 8:");
        //Tehtävä 8;
        int luku=10;
        int[] alkuluvut=Tehtava8.alkuLuvut(luku);
        System.out.println("Alkuluvut välillä "+(luku/2)+" ja "+luku+"=");
        for (int alkuluku : alkuluvut) {
            System.out.print(alkuluku);
        }
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 9:");
        //Tehtävä 9;
        int giveSec=3661;
        String time = Tehtava9.AikaMuutos(giveSec);
        System.out.println("Annetut sekunnit muunnettuna ovat: "+ time);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("tehtävä 10:");
        //Tehtävä 10;
        HashMap<String, ArrayList<Integer>>numerot=Tehtava10.luoMappi();
        System.out.println("Negatiiviset luvut: "+numerot.get("negatiivinen"));
        System.out.println("Nolla arvoiset: "+numerot.get("nolla"));
        System.out.println("Positiiviset luvut: "+numerot.get("positiivinen"));
        System.out.println(" ");
        System.out.println("Siinä kaikki :)");

    }
}

//System.out.println("Enter= seuraava tehtävä");
//System.console().readLine();

//import java.util.Scanner;
//System.out.println("Enter-näppäin: seuraava tehtävä");
//new Scanner(System.in).nextLine();
