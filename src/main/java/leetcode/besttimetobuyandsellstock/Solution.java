package leetcode.besttimetobuyandsellstock;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }
        
        return maxProfit;
    }
}