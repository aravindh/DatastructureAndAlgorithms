package com.aravindh.dsa.problemSolving;

import java.util.*;

/*
* Values will be in the range of 0 - n-1, find duplicate elements with time complexity O(n) and space complexity O(1)
*
* Approach: Use the index as the value and if element is present make them as negative,
* again if the negative value is encountered, then its a duplicate
*
* */
public class FindDuplicateInArray {
    public List<Integer> repeatedNumber(final List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()){
            return Collections.emptyList();
        }
        Set<Integer> duplicateElements = new HashSet<Integer>();

        for(int i=0; i<numbers.size(); i++){
            int currValue = Math.abs(numbers.get(i));
            int idx = currValue;
            if(numbers.get(idx) < 0){
                duplicateElements.add(currValue);
            }else{
                numbers.set(idx, numbers.get(idx)*-1);
            }
        }
        if(duplicateElements.isEmpty()) {
            return Collections.EMPTY_LIST;
        }else{
            return new ArrayList<Integer>(duplicateElements);
        }
    }
}
