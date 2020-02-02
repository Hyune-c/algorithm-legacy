package leetcode.factorialtrailingzeroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialtrailingzeroesTest {
    Solution sol;
    int input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void trailingZeroes3() {
        input = 3;
        expected = 0;

        assertEquals(expected, sol.trailingZeroes(input));
    }

    @Test
    void trailingZeroes5() {
        input = 5;
        expected = 1;

        assertEquals(expected, sol.trailingZeroes(input));
    }

    @Test
    void trailingZeroes7() {
        input = 7;
        expected = 1;

        assertEquals(expected, sol.trailingZeroes(input));
    }

    @Test
    void trailingZeroes13() {
        input = 13;
        expected = 2;

        assertEquals(expected, sol.trailingZeroes(input));
    }

    @Test
    void trailingZeroes30() {
        input = 30;
        expected = 7;

        assertEquals(expected, sol.trailingZeroes(input));
    }

    @Test
    void trailingZeroes50() {
        input = 50;
        expected = 12;

        assertEquals(expected, sol.trailingZeroes(input));
    }
}