package leetcode.shortestunsortedcontinuoussubarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestunsortedcontinuoussubarrayTest {
    Solution sol;
    int[] input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void findUnsortedSubarray() {
        input = new int[]{2, 6, 4, 8, 10, 9, 15};
        expected = 5;

        assertEquals(expected, sol.findUnsortedSubarray(input));
    }

    @Test
    void findUnsortedSubarray2() {
        input = new int[]{1, 2, 3, 4};
        expected = 0;

        assertEquals(expected, sol.findUnsortedSubarray(input));
    }


}