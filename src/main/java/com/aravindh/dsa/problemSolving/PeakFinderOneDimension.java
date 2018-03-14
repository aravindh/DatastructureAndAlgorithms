package com.aravindh.dsa.problemSolving;

import java.util.List;

/*
* Find a peak, in a given array of numbers(peak can be even a local peak)
* element b is called as peak if  a <= b >= c where a and c are its neighbours.
* Since its <= and >= in peak definition, there always exists a peak in a nonEmpty array
*
* */

public class PeakFinderOneDimension{
    public Integer findPeak(List<Integer> numbers, boolean isIterative){
        if(isIterative){
            return peakFinderIterative(numbers);
        }else{
            return peakFinderRecursive(numbers, 0, numbers.size()-1);
        }
    }

    private Integer peakFinderIterative(List<Integer> numbers){
        if(numbers == null && numbers.isEmpty()){
            return null;
        }

        int start = 0;
        int end = numbers.size()-1;

        while(start <= end){
            int midIdx = (start+end)/2;
            Integer mid = numbers.get(midIdx);
            Integer midLeft = midIdx == start ? Integer.MIN_VALUE : numbers.get(midIdx-1);
            Integer midRight = midIdx == end ? Integer.MIN_VALUE : numbers.get(midIdx+1);

            if(mid >= midLeft && mid >= midRight){
                return mid;
            }else if(midLeft >= mid){
                end = midIdx -1;
            }else if(midRight >= mid){
                start = midIdx + 1;
            }

        }
        return null;
    }

    private Integer peakFinderRecursive(List<Integer> numbers, int start, int end){
       if(numbers == null || numbers.isEmpty() || start > end){
           return null;
       }
       int midIdx = (start+end)/2;
       int mid = numbers.get(midIdx);
       int midLeft = midIdx-1 < start ? Integer.MIN_VALUE: numbers.get(midIdx-1);
       int midRight = midIdx+1 > end ? Integer.MIN_VALUE: numbers.get(midIdx+1);

       if(mid >= midLeft && mid >= midRight){
           return mid;
       }else if(midLeft >= mid){
           return peakFinderRecursive(numbers, start, midIdx-1);
       }else{
           return peakFinderRecursive(numbers, midIdx+1, end);
       }
    }
}