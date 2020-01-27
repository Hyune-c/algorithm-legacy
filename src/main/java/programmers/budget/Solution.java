package programmers.budget;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int[] dArr = d;
        Arrays.sort(dArr);

        for (int i = 0; i < dArr.length; i++) {
            budget -= d[i];
            if (budget < 0) return i;
        }

        return dArr.length;
    }
}
