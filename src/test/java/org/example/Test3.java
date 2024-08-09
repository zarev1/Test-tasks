package org.example;

import org.junit.jupiter.api.Test;

public class Test3 {

    @Test
    public void test3() {

    }

    public double calculateAverageRightOn(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) return -1;

        int sum = 0, count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = matrix[0].length - 1; col > matrix[0].length / 2; col++) {
                if (col == matrix.length - 1
                        || (col < matrix.length - 1 && row <= col - 1)) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
