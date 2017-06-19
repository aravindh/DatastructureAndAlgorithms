package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.LinkedList;
import com.aravindh.dsa.linear.SinglyLinkedListNode;

/**
 * Created by aravindhravindran on 19/6/17.
 */
public class LinkedListSwapAlternateNodes extends LinkedList{
    public void swapAlternateNodes(){
        if(head != null && head.next != null && head.next.next != null){
            SinglyLinkedListNode prev = head.next;
            SinglyLinkedListNode curr = prev.next;
            this.head = reverseNodes(prev, curr);
        }
    }

    private SinglyLinkedListNode reverseNodes(SinglyLinkedListNode prev, SinglyLinkedListNode curr){
        SinglyLinkedListNode temp = curr.next;

        curr.next = prev;

        SinglyLinkedListNode prev1 = temp;
        if(prev1 != null && prev1.next != null) {
            SinglyLinkedListNode curr1 = prev1.next;
            prev.next = reverseNodes(prev1, curr1);
        }else{
            prev.next = prev1;
        }
        return curr;
    }


}
