package com.aravindh.dsa.sorting;

import com.aravindh.dsa.linear.MaxHeap;
import com.aravindh.dsa.linear.MinHeap;

import java.util.List;

/**
 * Created by aravindhravindran on 30/5/17.
 */
public class HeapSort extends MinHeap implements ISort{

    public void sort(List<Integer> elements) {
        if(elements == null || elements.isEmpty()){
            return;
        }
        populateItems(elements);
        //build max heap
        //loop runs from n/2 to 0 because the leaves are minHeap.
        for(int i=(size/2)-1; i>=0; i--){
            heapDown(i);
        }

        for(int i=0 ;i<elements.size(); i++){
            elements.set(i, extractMin());
        }
    }

    private void populateItems(List<Integer> elements){
        items = new int[elements.size()];
        for(int i =0; i< elements.size();i++){
            items[i] = elements.get(i);
        }
        size = elements.size();
    }
}
