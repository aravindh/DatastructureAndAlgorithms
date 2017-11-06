package com.aravindh.dsa.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeSort implements ISort{
    public void sort(List<Integer> elements) {
        List<Integer> sortedElements = mergeSort(elements, 0, elements.size() - 1);
        for(int i =0 ;i < sortedElements.size(); i++){
            elements.set(i, sortedElements.get(i));
        }
    }

    private List<Integer> mergeSort(List<Integer> elements, int start, int end){
        int diff = end - start;
        if(diff < 0){
            return Collections.emptyList();
        }
        if(diff == 0){
            return Arrays.asList(elements.get(start));
        }
        int midIdx = (start+end)/2;
        List<Integer> sortedLeft = mergeSort(elements, start, midIdx);
        List<Integer> sortedRight = mergeSort(elements, midIdx+1, end);
        return merge(sortedLeft, sortedRight);
    }

    private List<Integer> merge(List<Integer> sortedLeft, List<Integer> sortedRight){
        List<Integer> mergedList = new LinkedList<Integer>();
        int lPtr = 0;
        int rPtr = 0;
        while(lPtr < sortedLeft.size() || rPtr < sortedRight.size()){
            Integer left = lPtr < sortedLeft.size() ? sortedLeft.get(lPtr) : Integer.MAX_VALUE;
            Integer right = rPtr < sortedRight.size() ? sortedRight.get(rPtr) : Integer.MAX_VALUE;
            if(left < right){
                mergedList.add(left);
                lPtr++;
            }else{
                mergedList.add(right);
                rPtr++;
            }
        }
        return mergedList;
    }

}
