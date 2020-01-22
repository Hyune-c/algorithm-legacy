package leetcode.singlenumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber_linearSearch(int[] nums) {
        Set<Integer> seen = new HashSet();

        for (int n : nums) {
            if (seen.contains(n)) seen.remove(n);
            else seen.add(n);
        }

        return (int) seen.stream().toArray()[0];
    }

    public int singleNumber_sort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {
            if (i == nums.length - 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
        }

        return 0;
    }

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int n : nums) result ^= n;

        return result;
    }
}
