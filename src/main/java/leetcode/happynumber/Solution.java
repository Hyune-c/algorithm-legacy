package leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet();

        while (!seen.contains(n)) {
            if (n == 1) return true;

            seen.add(n);

            int tmp = 0;

            while (n >= 10) {
                int digit = n % 10;
                tmp += digit * digit;
                n /= 10;
            }

            n = tmp + n * n;
        }

        return false;
    }
}
