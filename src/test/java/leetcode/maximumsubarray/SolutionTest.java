package leetcode.maximumsubarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input;
    int expected;
    Solution sol;
//    Input: [-2,1,-3,4,-1,2,1,-5,4],
//    Output: 6
//    Explanation: [4,-1,2,1] has the largest sum = 6.

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    @Test
    void maxSubArray() {
        input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        expected = 6;

        assertEquals(expected, sol.maxSubArray(input));
    }

    @Test
    void maxSubArray2() {
        input = new int[]{1, -3, 4};
        expected = 4;

        System.out.println(sol.maxSubArray(input));
//        assertEquals(expected, sol.maxSubArray(input));
    }
}