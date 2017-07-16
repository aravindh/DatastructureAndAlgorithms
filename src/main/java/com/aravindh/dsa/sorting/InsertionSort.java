package com.aravindh.dsa.sorting;

import java.util.List;

/**
 * Created by aravindhravindran on 3/7/17.
 */
public class InsertionSort implements ISort {
    public void sort(List<Integer> elements) {

        for(int i = 1; i< elements.size(); i++){
            ///1.Get element to be inserted
            int current = elements.get(i);

            //2.Identify the element to be placed in sorted block
            int targetIndex = i-1;
            while(targetIndex >= 0 && elements.get(targetIndex) > current){
                elements.set(targetIndex+1, elements.get(targetIndex));
                targetIndex--;
            }
            targetIndex++;
            //3. Move the elements to right to make space
            moveElementsToRight(elements, targetIndex, i );
            //4.insert the element
            elements.set(targetIndex, current);
        }
    }

    private void moveElementsToRight(List<Integer> elements, int start, int end){
        for(int j = end -1; j >= start; j--){
            elements.set(j+1, elements.get(j));
        }
    }
}
