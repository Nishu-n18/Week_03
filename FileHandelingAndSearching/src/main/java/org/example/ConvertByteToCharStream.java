package org.example;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class ConvertByteToCharStream {
    public static void main(String[] args) {
        //InputStream reader read byte code and convert it into char
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Day_15\\src\\main\\java\\org\\example\\example.txt"), "UTF-8")) {
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);  // Reads the characters from the file with specified encoding
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


