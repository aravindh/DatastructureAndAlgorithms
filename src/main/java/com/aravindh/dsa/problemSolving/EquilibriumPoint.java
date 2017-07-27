package com.aravindh.dsa.problemSolving;

import java.util.List;

/*
* EquilibriumIndex of array is where index i such that
* lsum = a[i] = rsum
* if no such element found return -1
* */

public class EquilibriumPoint {

    public int getEquilibriumIndex(List<Integer> numbers){
        int totalSum = 0;
        for(Integer num : numbers){
            totalSum += num;
        }
        int lSum = 0;
        int rSum = totalSum;
        int idx = 0;
        while(idx < numbers.size()){
            int current = numbers.get(idx);
            rSum -= current;
            if(current == lSum && current == rSum){
                return idx;
            }
            lSum += current;
            idx++;
        }

        return -1;
    }
}
