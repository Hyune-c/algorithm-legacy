package leetcode.majorityelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityelementTest {
    Solution sol;
    int[] input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void majorityElement() {
        input = new int[]{3, 2, 3};
        expected = 3;

        assertEquals(expected, sol.majorityElement(input));
    }

    @Test
    void majorityElement2() {
        input = new int[]{2, 2, 1, 1, 1, 2, 2};
        expected = 2;

        assertEquals(expected, sol.majorityElement(input));
    }

    @Test
    void majorityElement3() {
        input = new int[]{1};
        expected = 1;

        assertEquals(expected, sol.majorityElement(input));
    }
}