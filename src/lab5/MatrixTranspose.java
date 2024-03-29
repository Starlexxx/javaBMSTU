package lab5;

import java.io.*;
import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) throws IOException {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.addAll(Arrays.asList(line.split("\\s+")));
            }
        }

        int size = (int) Math.sqrt(list.size());
        int[][] matrix = new int[size][size];
        int[][] transposedMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(list.get(i * size + j));
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
            writer.println("Original matrix:");
            for (int[] row : matrix) {
                for (int num : row) {
                    writer.print(num + " ");
                }
                writer.println();
            }

            writer.println("\nTransposed matrix:");
            for (int[] row : transposedMatrix) {
                for (int num : row) {
                    writer.print(num + " ");
                }
                writer.println();
            }
        }
    }
}
