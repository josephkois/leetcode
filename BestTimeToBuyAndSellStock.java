public int maxProfit(int[] prices) {
    int left = 0;
    int right = 0;
    int maxP = 0;

    while (right < prices.length()) {
        if (prices[left] < prices[right]) {
            int profit = prices[right] - prices[left];
            maxP = Math.max(maxP, profit);
        } else {
            left = right;
        }
        right = right + 1;
    }
    return maxP;
}