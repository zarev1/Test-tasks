package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2 {

    @Test
    public void test2() {
        assertEquals(1.0, calculateAverageLeft(new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        }));

        assertEquals(2.0, calculateAverageLeft(new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 5, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        }));
    }

    public double calculateAverageLeft(int[][] matrix) {
        if (matrix.length != matrix[0].length) return -1;

        int sum = 0, count = 0;
        int maxCol = matrix.length - 1;
        for (int row = 1; row < matrix.length - 1; row++) {
            maxCol--;
            for (int col = 0; col < row; col++) {
                if (col < maxCol) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }
}
