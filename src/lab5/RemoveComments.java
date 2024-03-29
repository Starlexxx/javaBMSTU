package lab5;

import java.io.*;
import java.nio.file.*;

public class RemoveComments {
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

        String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));
        String pattern = "(//.*)|(/\\*(.|\\n)*?\\*/)";
        String newContent = content.replaceAll(pattern, "");

        Files.write(Paths.get(outputFile.getPath()), newContent.getBytes());
    }
}