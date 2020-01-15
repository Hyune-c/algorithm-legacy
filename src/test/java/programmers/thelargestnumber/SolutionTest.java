package programmers.thelargestnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    static Solution sol;
    static int[] inputArr;
    static String expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
        inputArr = null;
        expected = null;
    }

    @Test
    void solutionTest1() {
        inputArr = new int[]{6, 10, 2};
        expected = "6210";

        assertEquals(expected, sol.solution(inputArr));
    }

    @Test
    void solutionTest2() {
        inputArr = new int[]{3, 30, 34, 5, 9};
        expected = "9534330";

        assertEquals(expected, sol.solution(inputArr));
    }

    @Test
    void solutionTest3() {
        inputArr = new int[]{998, 9, 999};
        expected = "9999998";

        assertEquals(expected, sol.solution(inputArr));
    }

    @Test
    void solutionTest4() {
        inputArr = new int[]{0,0,0,0,0};
        expected = "0";

        assertEquals(expected, sol.solution(inputArr));
    }
}