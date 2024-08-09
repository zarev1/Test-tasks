package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test9 {

    @Test
    public void test9() {
        assertEquals(3.0, calculateAverageUnderDiagonalsOn(new int[][]{
                {2, 5, 5, 2, 4, 2, 3},
                {4, 5, 4, 5, 1, 5, 4},
                {3, 5, 2, 4, 3, 2, 5},
                {1, 5, 4, 5, 5, 1, 4},
                {3, 4, 3, 1, 3, 1, 5},
                {3, 4, 4, 2, 3, 3, 1},
                {5, 3, 2, 1, 5, 1, 3}
        }));
        assertEquals(4.0, calculateAverageUnderDiagonalsOn(new int[][]{
                {2, 6, 7, 2, 5},
                {6, 9, 5, 8, 10},
                {2, 7, 2, 1, 5},
                {9, 4, 5, 5, 2},
                {3, 2, 2, 9, 4}
        }));

        assertEquals(3.0, calculateAverageUnderDiagonalsOn(new int[][]{
                {3, 3, 4},
                {4, 1, 1},
                {4, 3, 4},
        }));
    }

    public static double calculateAverageUnderDiagonalsOn(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        int count = 0;
        int minCol = 0;

        for (int row = n - 1; row > n / 2 - 1; row--) {
            if (row < n - 1) minCol++;
            for (int col = n - 1; col >= 0; col--) {
                if (col <= row && minCol <= col) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
