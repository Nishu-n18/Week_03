package org.example;

public class LinearSearchSentence {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {"Java is fun", "I love programming"};
        String word = "fun";

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence found: " + result);
    }
}
