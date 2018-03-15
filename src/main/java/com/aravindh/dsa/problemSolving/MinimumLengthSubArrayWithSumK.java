package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Created by aravindhravindran on 14/3/18.
 */
public class MinimumLengthSubArrayWithSumK {
    public Integer getSubArray(List<Integer> numbers, int k){
        if(numbers == null || numbers.isEmpty()){
            return null;
        }

        int start =0;
        int end = 0;
        int currSum = 0;
        int n = numbers.size();
        Integer minLength = n+1;
        while(end < n || start < n){

            if(end == n && start<n){
                currSum = currSum - numbers.get(start);
                start++;
            }

            while(currSum < k && end < n){
                currSum = currSum + numbers.get(end);
                end++;
            }

            while(currSum >= k && start < n){
                if(currSum == k && (end-start) < minLength){
                    minLength = end-start;
                }
                currSum = currSum - numbers.get(start);
                start++;
            }
        }
        if(minLength == (n+1)){
            return null;
        }
        return minLength;
    }
}
