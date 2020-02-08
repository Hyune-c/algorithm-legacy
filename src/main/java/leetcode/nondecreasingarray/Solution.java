package leetcode.nondecreasingarray;

class Solution {
  public boolean checkPossibility(int[] nums) {
    if (nums.length == 1) return true;

    int alreadyModified = 0;

    if (nums[0] > nums[1]) {
      alreadyModified++;
      nums[0] = Integer.MIN_VALUE;
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) {
        if (alreadyModified == 2)
          return false;
        alreadyModified++;
        nums[i] = nums[i - 1];
        i--;
      }
    }

    return true;
  }
}