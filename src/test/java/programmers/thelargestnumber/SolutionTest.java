package programmers.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    static  sol;
    static int[] inputArr;
    static String expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
        inputArr = null;
        expected = null;
    }

//    numbers	return
//            [6, 10, 2]	6210
//            [3, 30, 34, 5, 9]	9534330

    @Test
    void solution() {
        inputArr = new int[]{6, 10, 2};
        expected = "6210";

        assertEquals(expected, new Solution().);
    }
}