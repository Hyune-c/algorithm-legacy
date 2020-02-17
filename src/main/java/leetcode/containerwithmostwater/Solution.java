package leetcode.containerwithmostwater;

class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;
    int i = 0;
    int j = height.length - 1;

    while (j - i > 0) {
      maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }

    return maxArea;
  }
}