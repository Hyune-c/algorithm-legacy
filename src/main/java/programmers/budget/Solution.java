package programmers.budget;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        int sum = 0;
        int[] dArr = d;

        Arrays.sort(dArr);

        for (int i = 0; i < dArr.length; i++) {
            sum += dArr[i];
            cnt++;

            if (sum > budget) {
                cnt--;
                break;
            }
        }

        return cnt;
    }
}
