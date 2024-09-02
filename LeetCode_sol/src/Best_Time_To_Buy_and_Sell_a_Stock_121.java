class Best_Time_To_Buy_and_Sell_a_Stock_121 {
    public static int maxProfit(int[] prices) {
        // prices = [7 , 1, 300, 1, 70, 800, 20]
        int profit = 0;
        int buyDay = 0;

        for ( int i = 0 ; i  < prices.length ; i ++) {
            if ( prices[buyDay] > prices[i]) {
                buyDay = i;
            }
            profit = Math.max(profit, prices[i] - prices[buyDay]);
        }
        return profit;
    }
}