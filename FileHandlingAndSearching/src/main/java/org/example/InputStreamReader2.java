package org.example;
import java.io.*;

public class InputStreamReader2 {
    public static void main(String[] args) {
        String filename = "C:\\Day_15\\src\\main\\java\\org\\example\\write.txt";//path of file

            try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                //file writer write the text
                FileWriter fw = new FileWriter(filename, true)){
                //text from user
                System.out.println("Enter text");
                String line;

                while (true) {

                    line = br.readLine();
                    if (line.equalsIgnoreCase("exit")) {
                        break;
                    }
                    fw.write(line);
                    fw.write(System.lineSeparator());
                }//text saved to file
                System.out.println("Input saved to " + filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}


