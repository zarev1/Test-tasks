package org.example;

import org.junit.jupiter.api.Test;

public class Test7 {

    @Test
    public void test7() {

    }

    public double calculateAverageLeftOn(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) return -1;

        int sum = 0, count = 0;
        int maxCol = -1;

        for (int row = 0; row < matrix.length - 1; row--) {
            if (maxCol > row) maxCol--;
            else maxCol++;
            for (int col = 0; col <= maxCol; col++) {
                sum += matrix[row][col];
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
