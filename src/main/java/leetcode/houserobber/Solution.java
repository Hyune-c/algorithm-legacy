package leetcode.houserobber;

class Solution {
    public int robbery(int[] nums, int index) {
        int jump2 = nums[index];
        int jump3 = nums[index];

        if (nums.length > index + 2) jump2 += robbery(nums, index + 2);
        if (nums.length > index + 3) jump3 += robbery(nums, index + 3);

        return Math.max(jump2, jump3);
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(robbery(nums, 0), robbery(nums, 1));
    }
}