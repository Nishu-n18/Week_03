package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //If file is not found it throws file not found exception
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Day_15\\src\\main\\java\\org\\example\\nishu.txt";//filepath
        //FileReader object to read from the file
        FileReader fr = new FileReader(filePath);
        //buffer Reader object to read file efficiently
        try(BufferedReader br = new BufferedReader(fr)){
        String string;
        while ((string = br.readLine()) != null) {
            System.out.println(string);//print the text written
        }
    }
        catch(IOException e){//Handle io exception
            e.printStackTrace();
        }
    }
}
