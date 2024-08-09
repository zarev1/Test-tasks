package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10 {

    @Test
    public void test10() {
        assertEquals(4.0, calculateAverageUpperDiagonalsOn(new int[][]{
                {5, 5, 5, 2, 4, 2, 3},//64 sum
                {4, 5, 4, 5, 5, 5, 4},//16 el
                {3, 5, 2, 4, 3, 2, 5},
                {1, 5, 4, 5, 5, 1, 4},
                {3, 4, 3, 1, 3, 1, 5},
                {3, 4, 4, 2, 3, 3, 1},
                {5, 3, 2, 1, 5, 1, 3}
        }));
        assertEquals(5.0, calculateAverageUpperDiagonalsOn(new int[][]{
                {2, 6, 7, 2, 4},//45 sum
                {6, 9, 5, 8, 10},//9 el
                {2, 7, 2, 1, 5},
                {9, 4, 5, 5, 2},
                {3, 2, 2, 9, 4}
        }));

        assertEquals(3.0, calculateAverageUpperDiagonalsOn(new int[][]{
                {3, 3, 4},
                {4, 2, 1},
                {4, 3, 4},
        }));
    }

    public static double calculateAverageUpperDiagonalsOn(int[][] matrix) {
        if (matrix.length != matrix[0].length) return -1;

        int count = 0, sum = 0, maxCol = matrix.length - 1;

        for (int row = 0; row < matrix.length / 2 + 1; row++) {
            if (row > 0) maxCol--;
            for (int col = 0; col < matrix[0].length; col++) {
                if (row <= col && col <= maxCol) {
                    sum += matrix[row][col];
                    count++;
                }
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }
}
