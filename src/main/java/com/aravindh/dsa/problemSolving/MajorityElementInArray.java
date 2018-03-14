package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Given list of number, find the element which occurs more than n/2 time in array,
 * if no such element found return null
 *
 * Created by aravindhravindran on 14/3/18.
 */
public class MajorityElementInArray {
    public Integer getMajority(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return null;
        }
        Integer candidate = numbers.get(0);
        int count =1;
        for(int i=1; i<numbers.size(); i++){
            Integer curr = numbers.get(i);
            if(curr.equals(candidate)){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = curr;
                    count=1;
                }
            }
        }

        if(count == 0){
            return null;
        }else{
            int finalCount = 0;
            for(int i=0; i < numbers.size(); i++){
                Integer curr = numbers.get(i);
                if(candidate.equals(curr)){
                    finalCount++;
                }
            }

            if(finalCount > numbers.size()/2){
                return candidate;
            }else{
                return null;
            }
        }
    }
}
