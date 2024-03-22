package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Tehtava10 {
    public static HashMap<String,ArrayList<Integer>> luoMappi() {
        HashMap<String,ArrayList<Integer>>theMap=new HashMap<>();
        theMap.put("negatiivinen", new ArrayList<>());
        theMap.put("nolla", new ArrayList<>());
        theMap.put("positiivinen", new ArrayList<>());

        Random random = new Random();

        for (int i=0; i<100; i++) {
            int luku= random.nextInt(101)-50;
            if (luku<0) {
                theMap.get("negatiivinen").add(luku);
            } else if (luku==0) {
                theMap.get("nolla").add(luku);
            } else {
                theMap.get("positiivinen").add(luku);
            }
        }
        return theMap;
    }
}
