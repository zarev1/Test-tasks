package org.example;

import org.junit.jupiter.api.Test;

public class Test6 {

    @Test
    public void test6() {

    }

    public double calculateAverageBottom(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) return -1;

        int sum = 0, count = 0;
        int maxCol = matrix.length - 1;

        for (int row = matrix.length - 1; row < matrix.length / 2 + 1; row--) {
            maxCol--;
            for (int col = 1; col < matrix[0].length - 1; col++) {
                if (col <= maxCol) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
