package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.linear.LinkedList;
import com.aravindh.dsa.linear.SinglyLinkedListNode;

public class LinkedListIntersection extends LinkedList {

    public Integer getIntersectionNode(LinkedList list2){
        if(this.isEmpty() || list2.isEmpty()){
            return null;
        }

        int sizeList1 = this.size();
        int sizeList2 = list2.size();
        SinglyLinkedListNode p1 = head.next;
        SinglyLinkedListNode p2 = list2.head.next;

        if(sizeList1 > sizeList2){
            int diff = sizeList1 - sizeList2;
            while(diff > 0){
                p1 = p1.next;
                diff --;
            }
        }
        else if(sizeList1 < sizeList2){
            int diff = sizeList2 - sizeList1;
            while(diff > 0){
                p2 = p2.next;
                diff --;
            }
        }

        while(p1 != null && p2 != null && p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        if(p1 == null){
            return null;
        }else{
            return p1.data;
        }
    }


}
