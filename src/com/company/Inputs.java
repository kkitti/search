package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Kitti on 2016.11.09..
 */
public class Inputs {
    Vector<String> datas;
    File folder;

    Inputs() {
        datas = new Vector<>();
        folder = new File("tx");
    }

    Vector<String> getDatas() {
        for (final File fileEntry : folder.listFiles()) {
            try {
                Scanner reader = new Scanner(fileEntry);
                String input;
                while (reader.hasNext()) {
                    input = reader.nextLine();
                    String[] inputs = input.split(",");
                    for (int i = 0; i < inputs.length; i++) {
                        if (i == 1) {
                            datas.add(inputs[i].trim());
                        }
                    }
                }
                for (int u = 0; u < datas.size(); u++) {
                    System.out.println(datas.get(u));
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error while parsing log file: " + fileEntry.getName());
                e.printStackTrace();
            }
        }
        return datas;
    }
}
