package org.example;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomDoubleArray(4, 1.0, 10)));
        System.out.println(Arrays.toString(generateRandomDoubleArray(5, 1.0, 10)));
        double[] array = generateRandomDoubleArray(4, 1.0, 10);
        System.out.println(array[array.length / 2]);

        int[][] matrix = generateRandomSquareMatrix(7, 1, 5);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static double[] generateRandomDoubleArray(int size, double min, double max) {
        Random random = new Random();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = min + (max - min) * random.nextDouble(); // Генерация случайного числа в заданном диапазоне
        }

        return array;
    }

    public static int[][] generateRandomSquareMatrix(int length, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[length][length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        return matrix;
    }
}