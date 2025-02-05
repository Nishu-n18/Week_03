package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrences {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Day_15\\src\\main\\java\\org\\example\\word";//filepath
        //FileReader object to read from the file
        FileReader fr = new FileReader(filePath);
        //buffer Reader object to read file efficiently
        try(BufferedReader br = new BufferedReader(fr)){
            String string;
            //target string is hello
            String target="hello";
            int count=0;
            while ((string = br.readLine()) != null) {
                String words[]=string.split(" ");//split the string
                for(int i=0;i< words.length;i++) {
                    //if word at index i equal to target then count increment
                    if(words[i].equals(target))
                    count++;
                }
            }
            System.out.println(count);
        }
        catch(IOException e){//Handle io exception
            e.printStackTrace();
        }

    }
}
