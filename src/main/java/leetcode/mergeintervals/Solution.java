package leetcode.mergeintervals;

import java.util.LinkedList;
import java.util.List;

class Solution {

  public int[][] merge(int[][] intervals) {
    boolean[] nums = new boolean[10240];
    boolean[] intervalOfNums = new boolean[10240];
    int lastIndex = 0;

    for (int[] interval : intervals) {
      for (int i = interval[0]; i < interval[1] + 1; i++) {
        nums[i] = true;
        if (i != interval[1]) intervalOfNums[i] = true;
      }
      lastIndex = Math.max(lastIndex , interval[1]);
    }

    List<int[]> mergedList = new LinkedList<>();
    int begin = -1;
    for (int i = 0; i < lastIndex + 1; i++) {
      // interval 의 시작점
      if (nums[i] == true && begin == -1) {
        begin = i;
      }
      // interval 의 끝점
      if (intervalOfNums[i] == false && begin != -1) {
        mergedList.add(new int[]{begin , i});
        begin = -1;
      }
    }

    return mergedList.toArray(new int[0][]);
  }
}
