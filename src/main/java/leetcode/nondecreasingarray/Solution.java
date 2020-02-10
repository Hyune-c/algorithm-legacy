package leetcode.nondecreasingarray;

import java.util.Arrays;

class Solution {
  public int getMid(int a, int b, int c) {
    int[] tmp = new int[]{a, b, c};
    Arrays.sort(tmp);
    return tmp[1];
  }

  public boolean checkPossibility(int[] nums) {
    if (nums.length == 1) return true;

    int flag = Integer.MIN_VALUE;

    if(nums[0] > nums[1]){
//      flag =
    }

    for(int i = 1; i < nums.length; i++){
//      if()
    }

    return true;
  }
}