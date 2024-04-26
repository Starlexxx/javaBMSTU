package lab6;

import java.util.Stack;

public class MaxRectangleFinder {
    public static void main(String[] args) {
        MaxRectangleFinder mrf = new MaxRectangleFinder();
        int[][] matrix = { { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 1, 1, 1 } };
        int[][] maxRectangle = mrf.findMaxRectangle(matrix);
        System.out.println("Top-left: (" + maxRectangle[0][0] + ", " + maxRectangle[0][1] + ")");
        System.out.println("Bottom-right: (" + maxRectangle[1][0] + ", " + maxRectangle[1][1] + ")");
    }

    public int[][] findMaxRectangle(int[][] matrix) {
        int maxArea = 0;
        int[][] maxRectangle = null;
        int[] histogram = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                histogram[j] = matrix[i][j] == 1 ? histogram[j] + 1 : 0;
            }
            int area = maxHistogram(histogram);
            if (area > maxArea) {
                maxArea = area;
                maxRectangle = new int[][] { { i - maxArea / histogram.length + 1, 0 }, { i, histogram.length - 1 } };
            }
        }
        return maxRectangle;
    }

    private int maxHistogram(int[] histogram) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < histogram.length) {
            if (stack.isEmpty() || histogram[stack.peek()] <= histogram[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                maxArea = Math.max(maxArea, histogram[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxArea = Math.max(maxArea, histogram[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }
        return maxArea;
    }
}