package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Count frequencies of elements in an array with O(n) time complexity and O(1) space complexity.
 * The values in the array are in the range of 1 - n where n is the length of array.
 *
 * Hint: The easier solution will be using hashMap, but try thinking the existing array for the purpose HashMap.
 *
 * Created by aravindhravindran on 26/11/17.
 */
public class CountFrequenciesOfElements {

    private int getIndex(int value){
        return value-1;
    }
    public void count(List<Integer> elements){
        if(elements.isEmpty()){
            return;
        }

        int index =0;
        while(index < elements.size()){
            final Integer currentValue = elements.get(index);
            if(currentValue >0){
                final Integer targetValue = elements.get(getIndex(currentValue));
                if(targetValue > 0){
                    elements.set(index, targetValue);
                    elements.set(getIndex(currentValue), -1);
                }else{
                    elements.set(getIndex(currentValue), targetValue -1);
                    elements.set(index, 0);
                    index++;
                }
            }else{
                index++;
            }

        }

        for(int i=0; i < elements.size(); i++){
            if(elements.get(i) < 0){
                elements.set(i, elements.get(i)*-1);
            }
        }
    }
}
