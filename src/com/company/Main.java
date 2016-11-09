package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Inputs inputs = new Inputs();
        Search s = new Search();
        Vector<String> vs = inputs.getDatas();
        int p = s.search(vs);
        System.out.println("mennyiszer szerepel benne: "+p);
    }
}