package leetcode.sortcolors;

class Solution {

  public void sortColors(int[] nums) {
    int[] colorCount = new int[3];

    for (int num : nums) {
      colorCount[num]++;
    }

    for (int index = 0, i = 0; i < colorCount.length; i++) {
      for (int j = 0; j < colorCount[i]; j++) {
        nums[index++] = i;
      }
    }
  }
}
