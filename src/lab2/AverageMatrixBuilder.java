package lab2;

import static lab2.DeterminantCalculator.buildDoubleMatrix;
import static lab2.DeterminantCalculator.printMatrix;

public class AverageMatrixBuilder {
    public static void main(String[] args) {
        Double[][] matrix = buildDoubleMatrix();
        System.out.println("The matrix is:");
        printMatrix(matrix);
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            double average = calculateAverage(matrix[i]);
            for (int j = 0; j < n; j++) {
                matrix[i][j] -= average;
            }
        }

        System.out.println("The resulting matrix is:");

        printMatrix(matrix);
    }

    public static double calculateAverage(Double[] row) {
        double sum = 0;
        for (double num : row) {
            sum += num;
        }
        return sum / row.length;
    }
}
