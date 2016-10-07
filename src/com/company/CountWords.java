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
    public void Counter(String filepath) {
    Map<String, Integer> m1 = new TreeMap<String, Integer>();

    Scanner sc = null;

        try {
        sc = new Scanner(new File(filepath));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        while (sc.hasNextLine()) {
        Scanner s2 = new Scanner(sc.nextLine());
        while (s2.hasNext()) {
            String s = s2.next();
            if (m1.containsKey(s) ){m1.put(s, m1.get(s)+1);}
            else {m1.put(s, 1);}
            //System.out.println(s);
        }
    }
    System.out.println(m1);

        try{
            NoCatsFoundInFileException(m1);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    private void NoCatsFoundInFileException(Map tm) {
        if ( !tm.containsKey("cat") && !tm.containsKey("cats")) {
            throw new NullPointerException("There are no cats in the file");
        }
    }
}
