package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test13 {

    @Test
    public void test13() {
        assertArrayEquals(new int[]{3, 4, 4, 3, 4, 1, 4, 3, 2},
                toSnail(new int[][]{
                        {3, 3, 4},
                        {4, 2, 1},
                        {4, 3, 4},
                }));

        assertArrayEquals(new int[]{
                        2, 6, 2, 9, 3, 2, 2, 9,
                        4, 2, 5, 10, 4, 2, 7, 6,
                        9, 7, 4, 5, 5, 1, 8, 5, 2
                },
                toSnail(new int[][]{
                        {2, 6, 7, 2, 4},
                        {6, 9, 5, 8, 10},
                        {2, 7, 2, 1, 5},
                        {9, 4, 5, 5, 2},
                        {3, 2, 2, 9, 4}
                }));
    }

    public int[] toSnail(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) return new int[0];

        int[] array = new int[matrix.length * matrix.length];

        int index = 0;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= bottom; i++) {
                array[index++] = matrix[i][left];
            }
            left++;

            for (int i = left; i <= right; i++) {
                array[index++] = matrix[bottom][i];
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                array[index++] = matrix[i][right];
            }
            right--;

            for (int i = right; i >= left; i--) {
                array[index++] = matrix[top][i];
            }
            top++;
        }

        return array;
    }
}
