package leetcode.countprimes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountprimesTest {
    Solution sol;
    int input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void countPrimes() {
        input = 10;
        expected = 4;

        assertEquals(expected, sol.countPrimes(input));
    }

    @Test
    void countPrimes2() {
        input = 2;
        expected = 0;

        assertEquals(expected, sol.countPrimes(input));
    }
}