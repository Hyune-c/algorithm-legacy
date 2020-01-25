package leetcode.movezeroes;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> numQueue = new LinkedList<>();
        int index = 0;

        for (int i : nums) if (i != 0) numQueue.add(i);
        while (!numQueue.isEmpty()) nums[index++] = numQueue.poll();
        while (index < nums.length) nums[index++] = 0;
    }
}