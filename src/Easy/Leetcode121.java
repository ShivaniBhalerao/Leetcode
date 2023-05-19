package Easy;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int minStockPrice=prices[0];
        int maxProfit=0;
        for(int price:prices){
            maxProfit=Math.max(maxProfit,price-minStockPrice);
            minStockPrice=Math.min(minStockPrice,price);
        }
        return maxProfit;
    }
}
