package com.aravindh.dsa.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfCoinsForGivenAmount {
    Map<Integer, Integer> amountVsMinCoins = new HashMap();

    public int coinChange(int[] coins, int amount) {
        return getMinCoins(coins, amount);
    }

    private int getMinCoins(int[] coins, int amount){
        //System.out.println("Amount "+amount);
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }
        if(amountVsMinCoins.containsKey(amount)){
            return amountVsMinCoins.get(amount);
        }
        int i = coins.length-1;
        int minCoins = -1;
        for(;i >= 0; i--){
            int remainMinCoins = getMinCoins(coins, amount-coins[i]);
            if(remainMinCoins == -1){
                continue;
            }
            int currCoins = 1 + remainMinCoins;
            if(currCoins < minCoins){
                minCoins = currCoins;
            }
        }
        return minCoins;
    }
}
