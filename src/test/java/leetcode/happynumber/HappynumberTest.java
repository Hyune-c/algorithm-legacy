package leetcode.happynumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappynumberTest {
    Solution sol;
    int input;
    boolean expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
        input = 0;
    }

    @Test
    void isHappy_19() {
        input = 19;
        expected = true;

        assertEquals(expected, sol.isHappy(input));
    }

    @Test
    void isHappy_7() {
        input = 7;
        expected = true;

        assertEquals(expected, sol.isHappy(input));
    }
}