package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * Created by aravindhravindran on 18/7/17.
 */
public class FindCountOccurrencesOfNumberInSorted {
    public int findCount(List<Integer> numbers, int target){
        FindFirstOrLastOccurrenceOfElement findOccurrence = new FindFirstOrLastOccurrenceOfElement();
        int count = 0;
        int firstIndex = findOccurrence.findFirstOrLastIndex(numbers, target, true);
        if(firstIndex == -1){
            return count;
        }
        int lastIndex = findOccurrence.findFirstOrLastIndex(numbers, target, false);
        count = 1;
        count += (lastIndex - firstIndex);
        return count;
    }
}
