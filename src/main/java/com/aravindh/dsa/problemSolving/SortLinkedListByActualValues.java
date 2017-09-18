package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.LinkedList;
import com.aravindh.dsa.linear.SinglyLinkedListNode;

/*
* Given a linked list which is sorted by abs. values, which need to be sorted by actual values.
 * Example:
 * i/p: 1 -> 2 -> 3 -> -4 -> -5
 * o/p: -5 -> -4 -> 1 -> 2 -> 3
 *
 * i/p: 1 -> 2 -> 3 -> 4 -> 5
 * o/p: 1 -> 2 -> 3 -> 4 -> 5
 *
 * i/p: -1 -> -2 -> -3 -> -4 -> -5
 * o/p: -5 -> -4 -> -3 -> -2 -> -1
 *
 * */
public class SortLinkedListByActualValues extends LinkedList {

    /*public void sort(){
        if(isEmpty()){
            return;
        }
        SinglyLinkedListNode curr = head.next;
        SinglyLinkedListNode prev = head;
        while(curr != null){
            if(curr.data < 0){
                prev.next = curr.next;
                prepend(curr);
                curr = prev;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
    }*/

    public void sort(){
        if(isEmpty()){
            return;
        }
        SinglyLinkedListNode negativeHead = null;
        SinglyLinkedListNode positiveHead = null;
        SinglyLinkedListNode firstNegative = null;
        SinglyLinkedListNode lastPositive = null;
        SinglyLinkedListNode curr = head.next;

        while(curr != null){
            SinglyLinkedListNode next = curr.next;
            curr.next = null;
            if(curr.data < 0){
                //prepend
                if(negativeHead == null){
                    negativeHead = curr;
                    firstNegative = curr;
                }else{
                    curr.next = negativeHead;
                    negativeHead = curr;
                }
            }else{
                //append
                if(positiveHead == null){
                    positiveHead = curr;
                }else{
                    lastPositive.next = curr;
                }
                lastPositive = curr;
            }
            curr = next;
        }

        if(negativeHead != null){
            head.next = negativeHead;
            firstNegative.next = positiveHead;
        }else{
            head.next = positiveHead;
        }

        if(lastPositive != null){
            lastPositive.next = null;
        }



    }

}
