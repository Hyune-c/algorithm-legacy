package leetcode.shortestunsortedcontinuoussubarray;

import java.util.Arrays;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int begin = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                if (begin == -1) begin = i;
                else end = i;
            }
        }

        return (begin == -1 && end == -1) ? 0 : end - begin + 1;
    }
}