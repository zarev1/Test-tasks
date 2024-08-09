package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    public void testShortArray() {
        assertEquals(
                1,
                shortArray(new int[]{1, 3, 3, 3, 4, 2, 2, 2, 2, 5, 6, 4, 2})
        );
    }

    /*
    1. Найти индекс начала наиболее короткой (не менее 2) и непрерывной
    последовательности одинаковых чисел в целочисленном массиве
     */

    private int shortArray(int[] array) {
        if (array == null || array.length < 2) return -1;

        int minIndex = -1, minLength = array.length + 1;

        for (int i = 0; i < array.length; i++) {
            int currentIndex = i;
            int currentValue = array[i];
            int currentLength = 1;

            while (i + 1 < array.length && array[i + 1] == currentValue) {
                currentLength++;
                i++;
            }

            if (currentLength >= 2 && currentLength < minLength) {
                minLength = currentLength;
                minIndex = currentIndex;
            }
        }

        return minIndex;
    }
}
