public class A_122_BestTimeToBuyStock2 {
    public int maxProfit(int[] prices) {
        int days = prices.length;
        int profit=0;
        for (int i=0; i <days-1; i++){
            if(prices[i]< prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
