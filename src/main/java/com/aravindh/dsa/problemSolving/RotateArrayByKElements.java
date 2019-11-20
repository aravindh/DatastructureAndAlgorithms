package com.aravindh.dsa.problemSolving;

import java.util.List;

public class RotateArrayByKElements {
    public void rotate(List<Integer> list, int k){
        if(list == null || list.isEmpty() || k == list.size()){
            return;
        }
        if(k > list.size()){
            k = list.size() - k;
        }
        
    }
}
