package org.example;

public class ReverseString {
    public static String reverseString(String input) {
        //String Builder object
        StringBuilder sb = new StringBuilder();
        //Append the input
        sb.append(input);
        //reverse the string
        sb.reverse();
        return sb.toString();

    }

    public static void main(String[] args) {
        String input="hello";
        String output=reverseString(input);
        System.out.println("original " +input);
        System.out.println("After reverse " +output);


    }
}
