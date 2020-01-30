package leetcode.mergesortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergesortedarrayTest {
    Solution sol;
    int[] nums1, nums2;
    int m, n;
    int[] expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void merge() {
        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        m = 3;
        nums2 = new int[]{2, 5, 6};
        n = 3;
        expected = new int[]{1, 2, 2, 3, 5, 6};

        sol.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}