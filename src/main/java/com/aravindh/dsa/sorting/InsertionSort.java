package com.aravindh.dsa.sorting;

import java.util.List;

/**
 * Created by aravindhravindran on 3/7/17.
 */
public class InsertionSort implements ISort {
    public void sort(List<Integer> elements) {

        for(int i = 1; i< elements.size(); i++){
            int current = elements.get(i);

            int j = i-1;
            while(j >= 0 && elements.get(j) > current){
                elements.set(j+1, elements.get(j));
                j--;
            }

            elements.set(j+1, current);
        }
    }
}
