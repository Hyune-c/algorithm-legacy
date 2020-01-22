package leetcode.singlenumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglenumberTest {
    Solution sol;
    int[] input;
    int expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    @Test
    void singleNumber_1() {
        input = new int[]{2, 2, 1};
        expected = 1;

        assertEquals(expected, sol.singleNumber(input));
    }

    @Test
    void singleNumber_2() {
        input = new int[]{4, 1, 2, 1, 2};
        expected = 4;

        assertEquals(expected, sol.singleNumber(input));
    }
}