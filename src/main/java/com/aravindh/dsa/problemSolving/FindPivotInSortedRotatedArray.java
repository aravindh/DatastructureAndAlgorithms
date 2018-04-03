package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Created by aravindhravindran on 17/3/18.
 */
public class FindPivotInSortedRotatedArray {
    private Integer getPivotIterative(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return null;
        }
        int start = 0;
        int end = numbers.size()-1;
        while(start <= end){

            //Numbers are sorted order
            if(numbers.get(start) <= numbers.get(end)){
                break;
            }

            int mid = (start + end)/2;
            //check if mid is pivot
            if(numbers.get(mid) > numbers.get(mid+1)){
                return numbers.get(mid+1);
            }
            //first half is not sorted
            if(numbers.get(start) > numbers.get(mid)){
                end = mid;
            }else{
                start = mid;
            }
        }
        return numbers.get(0);
    }

    private Integer getPivotRecursive(List<Integer> numbers, int start, int end){
        if(start>end){
            return null;
        }

        //numbers are already sorted
        if(numbers.get(start) <= numbers.get(end)){
            return numbers.get(start);
        }

        int mid = (start+end)/2;
        //check if mid is pivot
        if(numbers.get(mid) > numbers.get(mid+1)){
            return numbers.get(mid+1);
        }

        if(numbers.get(start) > numbers.get(mid)){
            return getPivotRecursive(numbers, start, mid);
        }else{
            return getPivotRecursive(numbers, mid, end);
        }

    }
    public Integer getPivot(List<Integer> numbers, boolean isIterative){
        if(isIterative){
            return getPivotIterative(numbers);
        }else{
            if(numbers == null || numbers.isEmpty()){
                return null;
            }
            return getPivotRecursive(numbers, 0, numbers.size()-1);
        }
    }
}
