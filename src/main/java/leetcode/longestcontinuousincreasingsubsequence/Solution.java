package leetcode.longestcontinuousincreasingsubsequence;

class Solution {

  public int findLengthOfLCIS(int[] nums) {
    if (nums.length < 2) return nums.length;
    int longestCount = 0;
    int curCount = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] < nums[i]) {
        curCount++;
      } else {
        longestCount = Math.max(curCount, longestCount);
        curCount = 0;
      }
    }

    return Math.max(curCount + 1, longestCount + 1);
  }
}