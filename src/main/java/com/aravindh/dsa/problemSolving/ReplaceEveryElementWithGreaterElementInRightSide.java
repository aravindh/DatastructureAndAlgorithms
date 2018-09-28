package com.aravindh.dsa.problemSolving;

import java.util.List;

public class ReplaceEveryElementWithGreaterElementInRightSide {
    public void replace(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return;
        }
        int max = numbers.get(numbers.size()-1);
        for(int i = numbers.size()-2; i >= 0; i--){
            int curr = numbers.get(i);
            if(max >= curr){
                numbers.set(i, max);
            }else{
                max = curr;
            }
        }
    }
}
