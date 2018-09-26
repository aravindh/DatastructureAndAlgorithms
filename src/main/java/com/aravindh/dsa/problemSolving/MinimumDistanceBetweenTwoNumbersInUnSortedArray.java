package com.aravindh.dsa.problemSolving;

import java.util.List;

public class MinimumDistanceBetweenTwoNumbersInUnSortedArray {
    public int getMinimumDistance(List<Integer> unSortedNumbers, int x, int y){
        if(unSortedNumbers.isEmpty()){
            return -1;
        }
        int distance = 0;
        int minimumDistance = Integer.MAX_VALUE;
        int prev = -1;
        int prevIdx = 0;
        for(int i = 0; i<unSortedNumbers.size(); i++){
            int current = unSortedNumbers.get(i);
            distance++;
            if(current == x || current == y){
                if(prev == -1 || current == prev){
                    distance = 0;
                    prev = current;
                    prevIdx = i;
                }else{
                    if(distance < minimumDistance){
                        minimumDistance = distance;
                    }
                    distance = 0;
                    prev = current;
                    prevIdx = i;
                }
            }
        }
        return minimumDistance;
    }
}
