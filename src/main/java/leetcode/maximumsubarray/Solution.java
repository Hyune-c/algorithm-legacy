package leetcode.maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(0, sum) + nums[i];
            result = Math.max(result, sum);
        }

        return result;
    }
}
