package lab5;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SwapWords {
    public static void main(String[] args) throws IOException {
        String inputFilePath = args[0];
        String outputDirPath = args[1];
        String outputFileName = args[2];

        File outputDir = new File(outputDirPath);
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        File outputFile = new File(outputDir, outputFileName);
        outputFile.createNewFile();

        List<String> lines = Files.readAllLines(Paths.get(inputFilePath));
        List<String> newLines = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.split(" ");
            if (words.length > 1) {
                String temp = words[0];
                words[0] = words[words.length - 1];
                words[words.length - 1] = temp;
            }
            newLines.add(String.join(" ", words));
        }

        Files.write(Paths.get(outputFile.getPath()), newLines);
    }
}