package leetcode.climbingstairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    int input;
    int expected;
    Solution sol;

    @BeforeEach
    void beforeEach(){
        sol = new Solution();
    }

    @Test
    void climbStairs() {
        input = 1;
        expected = 1;

        assertEquals(expected, sol.climbStairs(input));

        input = 2;
        expected = 2;

        assertEquals(expected, sol.climbStairs(input));

        input = 3;
        expected = 3;

        assertEquals(expected, sol.climbStairs(input));

        input = 4;
        expected = 5;

        assertEquals(expected, sol.climbStairs(input));

        input = 5;
        expected = 8;

        assertEquals(expected, sol.climbStairs(input));

        input = 6;
        expected = 13;

        assertEquals(expected, sol.climbStairs(input));

        input = 7;
        expected = 21;

        assertEquals(expected, sol.climbStairs(input));

        input = 8;
        expected = 34;

        assertEquals(expected, sol.climbStairs(input));

        input = 44;
        expected = 1134903170;

        assertEquals(expected, sol.climbStairs(input));
    }
}