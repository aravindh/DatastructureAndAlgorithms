package com.aravindh.dsa.problemSolving;

import java.util.List;

public class FindCountOfRotationOfSortedNumbers {
    public int findRotationCount(List<Integer> numbers){
        int start = 0;
        int end = numbers.size()-1;
        int size = numbers.size();
        while(start <= end){
            if(numbers.get(start) <= numbers.get(end)){ // case if start and end equals
                return (size - start)%size;//Mod  by size because, if the sorted array is either rotated 0 times or size's times.
            }
            int mid = (start+ end)/2;
            if(numbers.get(mid) < numbers.get((mid+1)%size) &&
                    numbers.get(mid) < numbers.get((mid+size-1)%size)){ // case if the mid is the point of change
                return (size-mid)%size;
            }else if(numbers.get(mid) > numbers.get(end)){
                start = mid+1;
            }else if(numbers.get(mid) < numbers.get(start)){
                end = mid -1;
            }
        }
        return 0;
    }
}
