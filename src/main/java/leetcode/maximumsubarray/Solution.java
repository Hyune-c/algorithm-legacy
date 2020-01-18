package leetcode.maximumsubarray;

import java.util.Arrays;

public class Solution {
//    Input: [-2,1,-3,4,-1,2,1,-5,4],
//    Input: [1,-3,4],
//    input = new int[]{1, -3, 4, -3, 10};

//    private int[] redefineArr(int[] nums) {
//        if (nums == null) return null;
//        int[] returnArr = Arrays.stream(nums).filter(i -> i != 0).toArray();
//
//
//    }

    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int nowSum = 0;
        int underMaxSum = 0;

        if (nums.length == 1) return nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) continue;

            nowSum += nums[i];

            if (nums[i] > 0) {
                underMaxSum = maxSubArray(Arrays.copyOfRange(nums, (i == nums.length - 1) ? i : i + 1, nums.length));
                maxSum = (nowSum > underMaxSum) ? nowSum : underMaxSum;
            }
        }

        return maxSum;
    }
}
