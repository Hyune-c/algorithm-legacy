package leetcode.countprimes;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countPrimes(int n) {
        int[] arr = new int[n];
        int result = 0;

        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 1) continue;
            for (int j = 2; i * j < n; j++) {
                arr[i * j] = 1;
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) result++;
        }

        return result;
    }
}