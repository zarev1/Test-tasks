package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test8 {

    @Test
    public void testSearchMedian() {

        assertEquals(
                8.218890431130783,
                searchMedian(new double[]{8.900174703626675, 8.218890431130783, 2.4736672824070043, 4.7137187694953955, 9.443997941107499})
        );

        double expectedMedian = (3.551483498873478 + 7.947677326637211) / 2;
        assertEquals(
                expectedMedian,
                searchMedian(new double[]{8.762020331574083, 1.6228701826130245, 3.551483498873478, 7.947677326637211})
        );
    }

    public double searchMedian(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    double n = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = n;
                }
            }
        }

        if (array.length % 2 != 0)
            return array[array.length / 2];
        else {
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        }
    }
}
