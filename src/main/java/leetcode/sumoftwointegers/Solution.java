package leetcode.sumoftwointegers;

class Solution {
    public int getSum(int a, int b) {
        int s = a ^ b;
        int carry = a & b;

        return (carry == 0) ? s : getSum(s, carry << 1);
    }
}