package leetcode.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int reverseX = reverseByInteger(x);
        int reversereverseX = reverseByInteger(reverseX);
        return (x != reversereverseX && x % 10 != 0) ? 0 : reverseX;
    }

    public int reverseByString(int x) {
        String result = "";
        char[] charStringX = (Math.abs(x) + "").toCharArray();

        for (int i = charStringX.length - 1; i >= 0; i--) {
            result += charStringX[i];
        }

        result = (x < 0) ? "-" + result : result;

        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverseByInteger(int x) {
        int result = 0;
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        while (x != 0) {
            if ((long) result * 10 > Integer.MAX_VALUE) return 0;
            result *= 10;

            int remain = x % 10;

            if ((long) result + remain > Integer.MAX_VALUE) return 0;
            result += remain;

            x /= 10;
        }

        return (isNegative == true) ? -1 * result : result;
    }

    public boolean safeAdd(int a, int b) {
        return ((long) a + (long) b > Integer.MAX_VALUE || (long) a + (long) b < Integer.MAX_VALUE) ? false : true;
    }
}
