package com.aravindh.dsa.problemSolving;

import java.util.List;

/*
* Find a peak, in a given array of numbers(peak can be even a local peak)
* element b is called as peak if  a <= b >= c where a and c are its neighbours.
* Since its <= and >= in peak definition, there always exists a peak in a nonEmpty array
*
* */

public class PeakFinderOneDimension{

    public Integer findPeak(List<Integer> numbers){
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
}