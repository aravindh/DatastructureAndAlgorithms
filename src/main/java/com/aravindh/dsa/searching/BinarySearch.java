package com.aravindh.dsa.searching;

import java.util.List;

/**
 * Created by aravindhravindran on 1/7/17.
 */
public class BinarySearch {
    public boolean search(List<Integer> numbers, int target, boolean isIterative){
        if(isIterative){
            return searchIterative(numbers, target);
        }else{
            return searchRecursive(numbers, target, 0, numbers.size()-1);
        }
    }

    private boolean searchIterative(List<Integer> numbers, int target){
        int start = 0;
        int end = numbers.size()-1;
        while(start < end){
            int mid = (start+end)/2;
            if(target == numbers.get(start) || target == numbers.get(end) || target == numbers.get(mid)){
                return true;
            }else{
                if(target < numbers.get(mid)){
                    end = mid;
                }else{
                    start = mid;
                }
            }
        }
        return false;
    }

    private boolean searchRecursive(List<Integer> numbers, int target, int start, int end){
        if(start > end){
            return false;
        }else{
            int mid = (start + end)/2;
            if(target == numbers.get(start) || target == numbers.get(end) || target == numbers.get(mid)){
                return true;
            }else{
                if(target < numbers.get(mid)){
                    return searchRecursive(numbers, target, start, mid-1);
                }else{
                    return searchRecursive(numbers, target, mid+1, end);
                }
            }
        }
    }
}
