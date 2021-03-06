package leetcode.searchinrotatedsortedarray;

class Solution {
  public int search(int[] nums, int target) {

    if (nums.length == 0) return -1;

    if (target >= nums[0]) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) return i;
      }
    } else if (target <= nums[nums.length - 1]) {
      for (int i = nums.length - 1; i > -1; i--) {
        if (nums[i] == target) return i;
      }
    }

    return -1;
  }
}
