public class A_121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
               int profit = prices[j] - prices[i];
               if (profit>maxProfit){
                   maxProfit = profit;
               }
            }
        }
        return maxProfit;
    }
//-----------------------------------------
    public static int maxProf(int[] prices) {
        int profit = 0;
        int lowest_price = prices[0];


        for (int today_price : prices) {    // 7:
            if (today_price < lowest_price) { //
                lowest_price = today_price;
            }
                profit = Math.max(profit, today_price - lowest_price);


        }
            return profit;
        }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(ma(prices));
    }













    public static int ma(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for(int todayPrice : prices){

            minPrice = Math.min(minPrice, todayPrice);
            profit = Math.max(profit, todayPrice-minPrice);
        }
        return profit;
    }
}
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.