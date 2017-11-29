package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.LinkedList;
import com.aravindh.dsa.linear.SinglyLinkedListNode;
/*
* Find N/k th node in a linked list where k is a input and n is size
*
* Approach: For every k jump move the nByKthNode one
*
* */
public class FindNByKthNodeInLinkedList extends LinkedList{

    public Integer getNByKthNode(int k){
        if(isEmpty()){
            return null;
        }
        SinglyLinkedListNode curr = head.next;
        SinglyLinkedListNode nByKthNode = head;
        int count = 1;
        while(curr != null){
            if(count == k){
                count = 0;
                nByKthNode = nByKthNode.next;
            }
            count++;
            curr = curr.next;
        }
        return nByKthNode.data;
    }
}
