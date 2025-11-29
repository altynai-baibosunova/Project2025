public class A_122_BestTimeToBuyStock2 {
    public static int maxProfit(int[] prices) {
        int days = prices.length;
        int profit=0;
        for (int i=0; i <days-1; i++){
            if(prices[i]< prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxPr(prices));
    }


    public static int maxProf(int[] prices) {
        int profit = 0;

        for(int i=1; i< prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }

    public static int maxPr(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}





