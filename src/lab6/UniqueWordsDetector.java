package lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsDetector {
    public static void main(String[] args) {
        UniqueWordsDetector uwd = new UniqueWordsDetector();
        System.out.println(uwd.detect("src/lab6/input.txt"));
    }
    public Set<String> detect(String filename) {
        Set<String> uniqueWords = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Collections.addAll(uniqueWords, line.toLowerCase().split("\\W+"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueWords;
    }
}