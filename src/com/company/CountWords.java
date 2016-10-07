package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by azolotukhin on 07.10.2016.
 */
public class CountWords {
    public void Counter(String filepath){

        Map<String, Integer> m1 = new TreeMap<String, Integer>();

        Scanner sc = null;

        try {
            sc = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNext()) {
            String s = sc.next();
            if (m1.containsKey(s) ){m1.put(s, m1.get(s)+1);}
            else {m1.put(s, 1);}
        }

        System.out.println(m1);

        try{
            if ( !m1.containsKey("cat") && !m1.containsKey("cats")) {
                throw new NoCatsFoundInFileException();
            }
        } catch (NoCatsFoundInFileException e){
            System.out.println("There are no cats in the file");
        }

    }

    private class NoCatsFoundInFileException extends Exception {
    }
}
