package programmers.average;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    Solution sol;
    int[] input;
    double expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        input = new int[]{1, 2, 3, 4};
        expected = 2.5;

        assertEquals(expected, sol.solution(input));
    }

    @Test
    void solution2() {
        input = new int[]{5, 5};
        expected = 5;

        assertEquals(expected, sol.solution(input));
    }
}