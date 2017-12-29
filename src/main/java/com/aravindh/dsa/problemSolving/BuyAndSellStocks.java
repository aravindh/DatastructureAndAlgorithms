package com.aravindh.dsa.problemSolving;

import java.util.List;

/*Buy and sell stocks maximize profit, There are two variants of this problem,
1. we can buy and sell any number of times to maximize profit.
2. perform one transaction with max profit
* Given list of stock prices on each day, Return the maximum profit that can be earned.
*
* */
public class BuyAndSellStocks {

    public int maxProfitMultipleTransaction(List<Integer> prices){
        if(prices.isEmpty()){
            return 0;
        }
        int prev = prices.get(0);
        int maxProfit = 0;
        Integer start = prev;
        Integer end = null;
        for(int i =1; i < prices.size(); i++){
            int curr = prices.get(i);
            if(curr < prev){
                if(end != null){
                    maxProfit += end - start;
                }
                start = curr;
                end = null;
            }else{
                end = curr;
            }
            prev = curr;
        }
        if(end != null){
            maxProfit += end - start;
        }
        return maxProfit;
    }

    public int maxProfitOneTransaction(List<Integer> prices){
        if(prices.isEmpty()){
            return 0;
        }
        int maxProfit = 0;
        int currProfit;
        int start = prices.get(0);
        for(int i=0; i < prices.size(); i++){
            int curr = prices.get(i);
            if(curr < start){
                start = curr;
            }
            currProfit = curr - start;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }
}

