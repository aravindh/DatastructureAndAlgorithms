package com.aravindh.dsa.sorting;

import java.util.List;

/**
 * Time Complexity:
 * O(n^2)
 *
 * Space Complexity:
 * O(n)
 *
 * Note:
 * In Each pass the max element bubbles out to max index(Same can be modified to get min)
 * Its a in-place algorithm, by segregating same space as sorted(end) and unsorted(start)
 *
 * Created by aravindhravindran on 23/6/17.
 */
public class BubbleSort implements ISort{

    public void sort(List<Integer> elements) {
        for(int k = 0 ; k < elements.size()-1; k++) {
            boolean isSwapped = false;
            int n = elements.size() - k;
            for (int i = 0, j = 1; j < n; j++, i++) {
                if (elements.get(j) < elements.get(i)) {
                    swap(elements, i, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

    private void swap(List<Integer> numbers, int start, int end){
        int temp = numbers.get(start);
        numbers.set(start, numbers.get(end));
        numbers.set(end, temp);
    }
}
