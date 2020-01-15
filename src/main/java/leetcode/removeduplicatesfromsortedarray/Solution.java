package leetcode.removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }

        return index + 1;
    }
}
