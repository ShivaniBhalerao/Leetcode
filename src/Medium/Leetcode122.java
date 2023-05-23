package Medium;

public class Leetcode122 {
    public int maxProfit(int[] prices) {
        //next stock price can either increase or decrease or stay the same
        //decrease: doesn't matter: we won't calculate this decrease
        //increase: we should add this difference as even if the next one gives more profit, A+B+C=D (see approach 3)
        //same: do not care

        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                maxProfit+=(prices[i]-prices[i-1]);
            }
        }
        return maxProfit;
    }
}
