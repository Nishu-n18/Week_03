package org.example;
import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        //String Builder object
        StringBuilder sb = new StringBuilder();
        //create hashset
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            //if set does not contain char it is added to set and append,
            // if already contains in set it does not append
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + output);
    }
}
