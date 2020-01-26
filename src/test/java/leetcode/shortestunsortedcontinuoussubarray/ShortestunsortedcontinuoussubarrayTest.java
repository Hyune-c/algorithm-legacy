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

    @Test
    void findUnsortedSubarray3() {
        input = new int[]{2, 1};
        expected = 2;

        assertEquals(expected, sol.findUnsortedSubarray(input));
    }

    @Test
    void findUnsortedSubarray4() {
        input = new int[]{3, 2, 1};
        expected = 3;

        assertEquals(expected, sol.findUnsortedSubarray(input));
    }

    @Test
    void findUnsortedSubarray5() {
        input = new int[]{1, 3, 2, 2, 2};
        expected = 4;

        assertEquals(expected, sol.findUnsortedSubarray(input));
    }
}