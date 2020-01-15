package leetcode.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] nums;
    int expected;
    int[] expectedNums;
    Solution sol;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    @Test
    void removeDuplicates() {
        nums = new int[]{1, 1, 2};
        expected = 2;
        expectedNums = new int[]{1, 2};

        assertEquals(expected, sol.removeDuplicates(nums));
        assertArrayEquals(expectedNums, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    void removeDuplicates2() {
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        expected = 5;
        expectedNums = new int[]{0, 1, 2, 3, 4};

        assertEquals(expected, sol.removeDuplicates(nums));
        assertArrayEquals(expectedNums, Arrays.copyOfRange(nums, 0, expected));
    }
}