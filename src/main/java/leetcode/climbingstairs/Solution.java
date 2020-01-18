package leetcode.climbingstairs;

public class Solution {
    static int way[];

    private void init(int n) {
        way = new int[(n == 1) ? n + 2 : n + 1];
        way[1] = 1;
        way[2] = 2;
    }

    public int climbStairs(int n) {
        init(n);
        for (int i = 3; i < n + 1; i++) {
            way[i] = way[i - 1] + way[i - 2];
        }

        return way[n];
    }
}
