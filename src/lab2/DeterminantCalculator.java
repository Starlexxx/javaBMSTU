package lab2;

import java.util.Random;
import java.util.Scanner;

public class DeterminantCalculator {
    public static void main(String[] args) {
        Integer[][] matrix = buildIntegerMatrix();

        System.out.println("The matrix is:");
        printMatrix(matrix);

        int determinant = calculateDeterminant(matrix);
        System.out.println("The determinant of the matrix is: " + determinant);
    }

    static <T> void printMatrix(T[][] matrix) {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static Integer[][] buildIntegerMatrix() {
        return buildMatrix(Integer.class);
    }

    static Double[][] buildDoubleMatrix() {
        return buildMatrix(Double.class);
    }

    private static <T> T[][] buildMatrix(Class<T> type) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimension of the matrix:");
        int n = scanner.nextInt();

        T[][] matrix = (T[][]) java.lang.reflect.Array.newInstance(type, n, n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (type == Integer.class) {
                    matrix[i][j] = type.cast(random.nextInt((n - (-n)) + 1) + (-n));
                } else if (type == Double.class) {
                    matrix[i][j] = type.cast((n - (-n)) * random.nextDouble() + (-n));
                }
            }
        }
        return matrix;
    }

    public static int calculateDeterminant(Integer[][] matrix) {
        int sum = 0;
        int s;
        if (matrix.length == 1) {
            return (matrix[0][0]);
        }
        for (int i = 0; i < matrix.length; i++) {
            Integer[][] smaller = new Integer[matrix.length - 1][matrix.length - 1];
            for (int a = 1; a < matrix.length; a++) {
                for (int b = 0; b < matrix.length; b++) {
                    if (b < i) {
                        smaller[a - 1][b] = matrix[a][b];
                    } else if (b > i) {
                        smaller[a - 1][b - 1] = matrix[a][b];
                    }
                }
            }
            if (i % 2 == 0) {
                s = 1;
            } else {
                s = -1;
            }
            sum += s * matrix[0][i] * (calculateDeterminant(smaller));
        }
        return (sum);
    }
}
