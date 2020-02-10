package leetcode.longestcontinuousincreasingsubsequence;

class Solution {

  public int findLengthOfLCIS(int[] nums) {
    if (nums.length < 2) return nums.length;
    int longestLength = 1;
    int begin = 0;
    int end = 0;

    if (nums[0] < nums[1]) {
      end = 1;
    } else {
      longestLength = begin - end + 1;
      begin = 1;
      end = 1;
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] < nums[i]) {
        end = i;
      } else {
        longestLength = Math.max(longestLength, end - begin + 1);
        begin = i;
        end = i;
      }
    }

    longestLength = Math.max(longestLength, end - begin + 1);

    return longestLength;
  }
}