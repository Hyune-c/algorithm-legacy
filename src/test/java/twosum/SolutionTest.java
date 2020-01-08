package twosum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    static Solution sol;
    static int[] nums;
    static int target;
    static int[] result;
    static int[] expected;

    @Before
    public void before() {
        sol = new Solution();
        nums = new int[]{};
        target = 0;
        result = new int[2];
        expected = new int[2];
    }

    @After
    public void after() {
        result = sol.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSum() {
        nums = new int[]{2, 7, 11, 15};
        target = 9;
        expected = new int[]{0, 1};
    }

    @Test
    public void twoSum2() {
        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
    }
}