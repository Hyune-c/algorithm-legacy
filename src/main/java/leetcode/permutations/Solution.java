package leetcode.permutations;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

  private List<List<Integer>> result = new LinkedList<>();

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  public void helper(int[] nums, int index) {
    if (index == nums.length - 1) {
      List<Integer> innerList = Arrays.stream(nums).boxed().collect(Collectors.toList());
      result.add(innerList);
      return;
    }

    for (int i = index; i < nums.length; i++) {
      swap(nums, index, i);
      helper(nums, index + 1);
      swap(nums, index, i);
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    helper(nums, 0);
    return result;
  }
}
