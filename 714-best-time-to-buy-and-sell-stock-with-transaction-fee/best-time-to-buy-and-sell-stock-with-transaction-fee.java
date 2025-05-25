class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int hold = -prices[0]; // Initial state: we bought the stock
        int cash = 0;          // Initial state: no stock, no profit

        for (int i = 1; i < n; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }

        return cash;
    }
}