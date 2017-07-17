package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Find First or last occurrence of the element in the given sorted array
 *
 * Approach 1: Linear search: Searching through all elements, this will be a bad approach since we are using the idea of sorted array.
 *
 * Approach 2: Binary Search: Do a binary search on elements and the occurrence(any occurrence) and search to left or right for first or last occurrence respectively.
 * But this would take linear time if i/p is [10,10,10,10,10] and target is 10
 *
 * Approach 3: Modified Binary Search: Do a binary search and after finding any occurrence of target, again search on left(first occurrence) or right space(last occurrence) till the start > end,
 * on each occurrence update the latest index.
 *
 * Created by aravindhravindran on 16/7/17.
 */
public class FindFirstOrLastOccurrenceOfElement {

    public int findFirstOrLastIndex(List<Integer> elements, int target, boolean isFirstIndex){
        int start = 0;
        int end = elements.size()-1;
        int result = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(elements.get(mid) == target){
                result = mid;
                if(isFirstIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else if(target < elements.get(mid)){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }

        return result;
    }
}
