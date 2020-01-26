package leetcode.findallnumbersdisappearedinanarray;

import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] returnArr = new int[nums.length];
        List<Integer> returnList = new ArrayList<>();

        for (int num : nums) returnArr[num - 1] = 1;
        for (int i = 0; i < returnArr.length; i++) if (returnArr[i] == 0) returnList.add(i + 1);

        return returnList;
    }
}