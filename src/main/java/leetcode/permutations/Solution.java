package leetcode.permutations;

import java.util.*;

class Solution {
  private List<List<Integer>> result = new LinkedList<>();
  private Integer[] integers;

  public void swap(int i, int j) {
    int tmp = integers[i];
    integers[i] = integers[j];
    integers[j] = tmp;
  }

  public void helper(int index) {
    if (index == integers.length - 1) {
      List<Integer> innerList = new ArrayList(Arrays.asList(integers));
      if (!result.contains(innerList))
        result.add(innerList);
      return;
    }

    for (int i = 0; i < integers.length; i++) {
      swap(index, i);
      helper(index + 1);
      swap(index, i);
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    helper(0);
    return result;
  }
}
