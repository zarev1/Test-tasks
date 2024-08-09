package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test15 {

    @Test
    public void test15(){
        assertEquals(0, minDifference(new int[]{3, 1, 4, 2, 2}));
        assertEquals(1, minDifference(new int[]{3, 1, 5, 4, 2, 2}));
    }

    public static int minDifference(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        boolean[] dp = new boolean[totalSum / 2 + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = totalSum / 2; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        int sum1 = 0;
        for (int j = totalSum / 2; j >= 0; j--) {
            if (dp[j]) {
                sum1 = j;
                break;
            }
        }

        return totalSum - 2 * sum1;
    }
}
