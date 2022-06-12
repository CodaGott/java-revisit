package main;

import java.time.Instant;

public class Example2 {


    public static void main(String[] args) {
        String word = "He llo worl d";

         String newWord = word.replace(" ", "%20");

        System.out.println(newWord);

        Instant now =Instant.now();

        System.out.println(now);

    }



    @Override
    public String toString() {
        return "Example2{}";
    }
}
