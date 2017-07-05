package com.aravindh.dsa.sorting;

import java.util.List;

/**
 * Time Complexity: O(n^2) Because the outer loop runs for (n-1) and inner loop runs for (n-2) on worst case.
 * SpaceComplexity: O(N) As its a in-place algorithm
 *
 * Note:
 * No extra space is created, instead the same is segregated in sorted(Left) and unSorted(right)
 *
 * Created by aravindhravindran on 3/7/17.
 */
public class SelectionSort implements ISort {
    public void sort(List<Integer> elements) {
        for(int i = 0 ; i < elements.size()-1; i++){
            Integer minIndex = i;
            for(int j = i+1; j < elements.size(); j++){
                if(elements.get(j) < elements.get(minIndex)){
                    minIndex = j;
                }
            }
            int temp = elements.get(i);
            elements.set(i, elements.get(minIndex));
            elements.set(minIndex, temp);
        }
    }
}
