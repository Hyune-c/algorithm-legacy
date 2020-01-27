package programmers.budget;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
    Solution sol;
    int[] d;
    int budget;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        d = new int[]{1, 3, 2, 5, 4};
        budget = 9;
        expected = 3;

        assertEquals(expected, sol.solution(d, budget));
    }

    @Test
    void solution2() {
        d = new int[]{2, 2, 3, 3};
        budget = 10;
        expected = 4;

        assertEquals(expected, sol.solution(d, budget));
    }
}