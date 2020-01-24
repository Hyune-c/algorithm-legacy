package leetcode.besttimetobuyandsellstock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BesttimetobuyandsellstockTest {
    Solution sol;
    int[] input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void maxProfit() {
        input = new int[]{7, 1, 5, 3, 6, 4};
        expected = 5;

        assertEquals(expected, sol.maxProfit(input));
    }

    @Test
    void maxProfit2() {
        input = new int[]{7, 6, 4, 3, 1};
        expected = 0;

        assertEquals(expected, sol.maxProfit(input));
    }
}