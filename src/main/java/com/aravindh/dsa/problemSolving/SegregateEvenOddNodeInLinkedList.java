package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.LinkedList;
import com.aravindh.dsa.linear.SinglyLinkedListNode;

public class SegregateEvenOddNodeInLinkedList extends LinkedList{
    public void segregate() {
        if (isEmpty()) {
            return;
        }
        SinglyLinkedListNode curr = head.next;
        SinglyLinkedListNode evenHead = null;
        SinglyLinkedListNode lastEven = null;
        SinglyLinkedListNode oddHead = null;
        SinglyLinkedListNode lastOdd = null;
        while(curr != null){
            SinglyLinkedListNode next = curr.next;
            curr.next = null;
            if(curr.data %2 == 0){
                //even
                if(evenHead == null){
                    evenHead = curr;
                    lastEven = curr;
                }else {
                    lastEven.next = curr;
                    lastEven = curr;
                }
            }else{
                if(oddHead == null){
                    oddHead = curr;
                    lastOdd = curr;
                }else {
                    lastOdd.next = curr;
                    lastOdd = curr;
                }
            }
            curr = next;
        }
        if(oddHead != null){
            head.next = oddHead;
        }else{
            head.next = evenHead;
        }

        if(lastOdd != null){
            lastOdd.next = evenHead;
        }
    }

}
