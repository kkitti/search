package com.company;

import java.util.Random;
import java.util.Vector;

/**
 * Created by Kitti on 2016.11.09..
 */
public class Search {

    String[] places;
    Search() {
        places = new String[11];
        places[0] = "WORK_TABLE";
        places[1] = "BEDROOM";
        places[2] = "UPPER_BATHROOM";
        places[3] = "STAIRS";
        places[4] = "ENTRANCE";
        places[5] = "LIVINGROOM_COACH";
        places[6] = "OUTSIDE";
        places[7] = "APPARTMENT_DOOR";
        places[8] = "LIVINGROOM_TABLE";
        places[9] = "LOWER_BATHROOM";
        places[10] = "KITCHEN";
    }

    public int search(Vector<String> v) {
        String[] lookingfor = getRandomArray();
        int howmany = 0;
        for (int i = 0; i < v.size() - lookingfor.length; i++) {
            s:
            for (int u = 0; u < lookingfor.length; u++) {
                if (v.get(i + u).equals(lookingfor[u])) {
                    if (u == lookingfor.length -1 ) {
                        howmany++;
                    }
                }else{
                    break s;
                }
            }
        }
        return howmany;
    }

    public String[] getRandomArray() {
        Random random = new Random();
        String[] randomArray = new String[Math.abs(random.nextInt()) % 4 + 1]; // 1-4 nagyságú tömb
        for (int i = 0; i < randomArray.length; i++) {
           randomArray[i] = places[Math.abs(random.nextInt()) % 11]; // 11 place-ünk van
           System.out.println("random: " + randomArray[i]);
        }
        return randomArray;
    }
}
