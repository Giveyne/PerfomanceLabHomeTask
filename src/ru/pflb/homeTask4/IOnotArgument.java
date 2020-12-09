package ru.pflb.homeTask4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOnotArgument {

    public void notArgument(File file) throws IOException{
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String line = br1.readLine();
        int count = 1;
        while (line != null){
            if(count%2 != 0){
                System.out.println(line);
            }
            line = br1.readLine();
            count++;
        }
        br1.close();
    }
}
