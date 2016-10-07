package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        //Lesson4 a = new Lesson4();
        //a.Lesson();

        /* 1.1 Review and understand how to select container for your needs:
        http://i.stack.imgur.com/aSDsG.png

        2.1 Using Map<String,Integer> create program which calculates number of occurances of each word in text file.
        Path to text file is provided as parameter.
        2.1.helper You may want to use Scanner class to read text file.
        If you are stuck - take a look here: http://stackoverflow.com/questions/4574041/read-next-word-in-java
        2.2 Sort results in alphabetical order and print to console.
        2.3 Handle possible FileNotFoundException with try-catch.
        2.4 Throw custom NoCatsFoundInFileException custom exception if there are no word 'cat' or 'cats' in text file.
        2.5 (do if you have time) Use Logger object to write stack trace information for exceptions above.
        Configure it so that it is written to log file instead of console. */

        CountWords cw = new CountWords();
        cw.Counter("C:/Temp/AnalyzeMe.txt");

    }
}
