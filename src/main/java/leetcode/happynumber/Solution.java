package leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> hashSet = new HashSet();

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n == 0 || hashSet.contains(n)) {
            return false;
        } else {
            int result = 0;

            while (n >= 10) {
                result += Math.pow((n % 10), 2);
                n /= 10;
            }

            result += Math.pow(n, 2);

            return isHappy(result);
        }
    }
}
