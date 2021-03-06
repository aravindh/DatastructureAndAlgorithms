package com.aravindh.dsa.problemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstAndLastOccurrenceOfNumberInSortedList {
    public List<Integer> getOccurrences(List<Integer> numbers, int target){
        if(numbers == null || numbers.isEmpty()) {
            return Collections.emptyList();
        }
        if(target < numbers.get(0) || target > numbers.get(numbers.size()-1)){
            return Collections.EMPTY_LIST;
        }

        int startIndex = getStartIndex(numbers, target);
        if(startIndex == -1){
            return Collections.EMPTY_LIST;
        }
        int endIndex = getEndIndex(numbers, target);
        return Arrays.asList(startIndex, endIndex);
    }

    private int getStartIndex(List<Integer> numbers, int target){
        int start = 0;
        int end = numbers.size()-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(target == numbers.get(mid) && (mid==start || target != numbers.get(mid-1))){
                return mid;
            }
            if(target <= numbers.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    private int getEndIndex(List<Integer> numbers, int target){
        int start = 0;
        int end = numbers.size()-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(target == numbers.get(mid) && (mid == end ||target != numbers.get(mid+1))){
                return mid;
            }
            if(target < numbers.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
