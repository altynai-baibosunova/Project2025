
public class A_121_BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int highestPrice = 0;

        for (int todayPrice : prices) {
            highestPrice = Math.max(highestPrice, todayPrice - lowestPrice);
            lowestPrice = Math.min(lowestPrice, todayPrice);
        }
        return highestPrice;

    }

    public static int maxProfits(int[] prices) {
        int lowest_price = prices[0];
        int highest_profit = 0;

        for (int today_price : prices) {
            highest_profit = Math.max(highest_profit, today_price - lowest_price);
            lowest_price = Math.min(lowest_price, today_price);

        }

        return highest_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(ma(prices));
    }
    public static int maxProf(int[] prices) {
        int lowest_price = prices[0];
        int highest_profit = 0;

        for(int current_price : prices){
            lowest_price = Math.min(current_price, lowest_price);
            highest_profit = Math.max(highest_profit, current_price-lowest_price);
        }
        return highest_profit;
    }
    public static int ma(int[] prices) {
        int lowest = prices[0];
        int highest = 0;

        for(int eachDay : prices){
            lowest = Math.min(lowest, eachDay);
            highest = Math.max(highest, eachDay-lowest);
        }
        return highest;
    }
}

//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//Constraints:
//
//1 <= prices.length <= 105
//0 <= prices[i] <= 104