package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.SinglyLinkedListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

    public SinglyLinkedListNode mergeSortedList(List<SinglyLinkedListNode> sortedListHeadNodes){
        if(sortedListHeadNodes == null || sortedListHeadNodes.isEmpty()){
            return null;
        }
        PriorityQueue<SinglyLinkedListNode> minHeap = new PriorityQueue<>(sortedListHeadNodes.size());
        while(!minHeap.isEmpty()){
            //get min
        }
        return null;
    }

    private boolean isEndOfAllList(List<SinglyLinkedListNode> currentNodes) {
        return false;
    }
}
