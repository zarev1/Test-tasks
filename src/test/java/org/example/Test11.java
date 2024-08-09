package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test11 {

    @Test
    public void test11() {
        assertEquals(4.0, calculateAverageUpperDiagonals(new int[][]{
                {5, 5, 5, 2, 4, 2, 3},//36 sum
                {4, 5, 4, 5, 5, 5, 4},//9 el
                {3, 5, 2, 4, 3, 2, 5},
                {1, 5, 4, 5, 5, 1, 4},
                {3, 4, 3, 1, 3, 1, 5},
                {3, 4, 4, 2, 3, 3, 1},
                {5, 3, 2, 1, 5, 1, 3}
        }));

        assertEquals(5.0, calculateAverageUpperDiagonals(new int[][]{
                {2, 6, 7, 2, 4},//20 sum
                {6, 9, 5, 8, 10},//4 el
                {2, 7, 2, 1, 5},
                {9, 4, 5, 5, 2},
                {3, 2, 2, 9, 4}
        }));

        assertEquals(3.0, calculateAverageUpperDiagonals(new int[][]{
                {3, 3, 4},
                {4, 2, 1},
                {4, 3, 4},
        }));
    }

    public static double calculateAverageUpperDiagonals(int[][] matrix) {
        if (matrix.length != matrix[0].length) return -1;

        int count = 0, sum = 0;
        int maxCol = matrix.length - 1, minCol = 0;
        int maxRow = matrix.length / 2 + 1;

        for (int row = 0; row < maxRow; row++) {
            maxCol--;
            minCol++;
            for (int col = minCol; col <= maxCol; col++) {
                if (row <= col) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }
}
