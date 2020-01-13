package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSumByDoubleFor(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " + " + nums[j] + " = " + (nums[i] + nums[j]));
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int findValue = target - nums[i];

            if (seen.containsKey(findValue) == true && seen.get(findValue) != i) {
                return new int[]{seen.get(findValue), i};
            } else {
                seen.put(nums[i], i);
            }
        }

        return null;
    }
}
