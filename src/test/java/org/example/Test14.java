package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test14 {

    @Test
    public void test14() {
        assertEquals(3, lengthOfLDS(new int[]{
                10, 5, 8, 3, 9, 4, 7, 6
        }));
    }

    public int lengthOfLDS(int[] nums) {
        if (nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] >= nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
