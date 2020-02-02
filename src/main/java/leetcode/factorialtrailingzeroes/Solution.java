package leetcode.factorialtrailingzeroes;

class Solution {
    public int trailingZeroes(int n) {
        int result = 0;

        for (int i = 1; n >= Math.pow(5, i); i++) {
            result += n / Math.pow(5, i);
        }

        return result;
    }
}