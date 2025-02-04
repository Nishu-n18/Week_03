package org.example;

public class ConcatenateString {
    public static String concatenateStrings(String[] strings) {
        //string Buffer object
        StringBuffer sb = new StringBuffer();
        //Iterate through each string array
        for (String string : strings) {
            sb.append(string);//append
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "Folks", "!", " Welcome", " to", " Capgemini"};
        String result = concatenateStrings(words);
        System.out.println("Concatenated String: " + result);//concatenated string print in result
    }
}

