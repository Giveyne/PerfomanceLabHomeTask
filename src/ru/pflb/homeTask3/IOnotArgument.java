package ru.pflb.homeTask3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOnotArgument {

    public void notArgument(File file) throws IOException{
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        br1.lines().forEach(s-> System.out.println(s));
        br1.close();
    }
}
