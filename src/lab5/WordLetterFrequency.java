package lab5;

import java.io.*;
import java.util.*;

public class WordLetterFrequency {
    public static void main(String[] args) throws IOException {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        Map<String, Integer> wordCount = new HashMap<>();
        Map<Character, Integer> letterCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    for (char letter : word.toCharArray()) {
                        letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
                    }
                }
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
            writer.println("Word frequencies:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            writer.println("\nLetter frequencies:");
            for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
