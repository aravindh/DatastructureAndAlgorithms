package com.aravindh.dsa.problemSolving;

import java.util.List;

public class StrictlyIncreasingSubArray {

    public int getSubArrayCount(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }

        int start = 0;
        int end = 0;
        int prev = numbers.get(0);
        int subArrayCount = 0;
        for(int i = 1; i< numbers.size(); i++){
            int curr = numbers.get(i);
            if(curr <= prev){
                subArrayCount = subArrayCount + getNumberOfSubArrays(start, end);
                start = i;
            }
            end = i;
            prev = curr;
        }
        if(start < end){
            subArrayCount = subArrayCount + getNumberOfSubArrays(start, end);
        }
        return subArrayCount;
    }

    private int getNumberOfSubArrays(int start, int end) {
        if(start >= end){
            return 0;
        }
        int len = (end - start)+1;
        return (len*(len-1))/2;
    }
}
