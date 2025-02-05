package org.example;

public class CompareStringBuilderWithBuffer {
    public static void compare() {

        long startTime, endTime;

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" Hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sf.append("Hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
        public static void main(String[] args) {
            compare();
        }



}
