package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Test5 {

    @Test
    public void test5() {
        assertEquals(
                3,
                searchIndexMoreBgList(new int[]{1, 2, 3, 5, 5, 5, 7, 7, 3, 4, 4})
        );
    }

    public int searchIndexMoreBgList(int[] array) {
        if (array == null || array.length < 1) return -1;

        int maxIndex = 0, maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            int currentIndex = i;
            int currentValue = array[i];
            int currentLength = 0;

            while (i < array.length - 1 && currentValue == array[i + 1]) {
                currentLength++;
                i++;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = currentIndex;
            }
        }
        return maxIndex;
    }
}
