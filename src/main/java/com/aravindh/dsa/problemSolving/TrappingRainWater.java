package com.aravindh.dsa.problemSolving;

import java.util.List;

public class TrappingRainWater {

    public Integer maxWaterTrapped(List<Integer> towers){
        if(towers == null || towers.isEmpty()){
            return 0;
        }
        int[] maxSeenRight =  new int[towers.size()];
        int maxSeenLeft = Integer.MIN_VALUE;
        int totalWaterCollected = 0;
        int max = Integer.MIN_VALUE;
        for(int i = towers.size()-1; i >= 0; i--){
            int curr = towers.get(i);
            if(curr >= max){
                max = curr;
            }
            maxSeenRight[i] = max;
        }

        for(int i = 0; i < towers.size()-1; i++){
            if(towers.get(i) >= maxSeenLeft){
                maxSeenLeft = towers.get(i);
            }
            totalWaterCollected = totalWaterCollected + Math.abs(towers.get(i)-Math.min(maxSeenLeft, maxSeenRight[i]));
        }

        return totalWaterCollected;
    }

}
