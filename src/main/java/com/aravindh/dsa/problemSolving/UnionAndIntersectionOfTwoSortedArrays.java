package com.aravindh.dsa.problemSolving;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnionAndIntersectionOfTwoSortedArrays {

    public List<Integer> getUnion(List<Integer> sortedArrayA, List<Integer> sortedArrayB){
        if(sortedArrayA.isEmpty()){
            return sortedArrayB;
        }
        if(sortedArrayB.isEmpty()){
            return sortedArrayA;
        }

        int aIndex = 0;
        int bIndex = 0;
        List unionList = new LinkedList();
        while(aIndex < sortedArrayA.size() && bIndex < sortedArrayB.size()){
            int aValue = sortedArrayA.get(aIndex);
            int bValue = sortedArrayB.get(bIndex);
            if(aValue == bValue){
                unionList.add(aValue);
                aIndex++;
                bIndex++;
            }else if(aValue < bValue){
                unionList.add(aValue);
                aIndex++;
            }else{
                unionList.add(bValue);
                bIndex++;
            }
        }
        //copy rest of the elements
        for(int i = aIndex; i < sortedArrayA.size(); i++){
            unionList.add(sortedArrayA.get(i));
        }
        for(int i = bIndex; i < sortedArrayB.size(); i++){
            unionList.add(sortedArrayB.get(i));
        }
        return unionList;
    }

    public List<Integer> getIntersection(List<Integer> sortedArrayA, List<Integer> sortedArrayB){
        if(sortedArrayA.isEmpty() || sortedArrayB.isEmpty()){
            return Collections.EMPTY_LIST;
        }

        int aIndex = 0;
        int bIndex = 0;
        List intersectionList = new LinkedList();
        while(aIndex < sortedArrayA.size() && bIndex < sortedArrayB.size()){
            int aValue = sortedArrayA.get(aIndex);
            int bValue = sortedArrayB.get(bIndex);
            if(aValue == bValue){
                intersectionList.add(aValue);
                aIndex++;
                bIndex++;
            }else if(aValue < bValue){
                aIndex++;
            }else{
                bIndex++;
            }
        }
        return intersectionList;
    }
}
