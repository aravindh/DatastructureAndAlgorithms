package com.aravindh.dsa.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class FirstMissingInteger {
    public int firstMissingPositive(List<Integer> a) {
        if(a == null || a.isEmpty()){
            return 1;
        }

        final int size = a.size();
        int missing = size+1;
        for(int i =0; i<size; i++){
            if(a.get(i) < 0 || a.get(i) > size){
                a.set(i,0);
            }
        }

        Integer temp = a.get(0);
        a.set(0, 0);
        int i = 1;
        while(temp != null || i < size){
            //get the current element
            Integer current = null;
            if(temp != null){
                current = temp;
                temp = null;
            }else{
                if(a.get(i) <= 0){
                    i++;
                }else {
                    current = a.get(i);
                    a.set(i, 0);
                    i++;
                }
            }
            //skip if current is -ve or 0
            if(current == null || current <= 0){
                continue;
            }
            //process a[current]
            int target = a.get(current-1);
            if(target > 0){
                temp = target;
                a.set(current-1, -1);
            }else {
                a.set(current-1, target-1);
            }
        }

        for(int idx =0; idx<size; idx++){
            int exists = a.get(idx);
            int element = idx+1;
            if(exists == 0){
                return element;
            }
        }

        return missing;

    }
}
