package leetcode.majorityelement;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        Map<Integer, Integer> numCnt = new HashMap<>();

        for (int num : nums) {
            if (numCnt.containsKey(num)) {
                int ret = numCnt.get(num) + 1;
                if (ret > nums.length / 2) return num;
                numCnt.put(num, ret);
            } else numCnt.put(num, 1);
        }

        return 0;
    }
}