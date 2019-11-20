package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import com.aravindh.dsa.linear.SinglyLinkedListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class MergeKSortedLinkedListTest {

    MergeKSortedLinkedList mergeKSortedLinkedList = new MergeKSortedLinkedList();

    private boolean isSorted(SinglyLinkedListNode head){
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode prev = null;
        while(curr != null){
            if(prev != null && curr.data < prev.data){
                return false;
            }
            prev = curr;
            curr = curr.next;
        }
        return true;
    }
    private int size(SinglyLinkedListNode ... heads){
        int size = 0;
        for(SinglyLinkedListNode curr : heads){
            while(curr != null){
                size++;
                curr = curr.next;
            }
        }
        return size;
    }

    @Test
    public void mergeSortedListWithUnEqualSizeListsReturnsSortedList(){
        SinglyLinkedListNode head1 = LinkedListCreationHelper.getLinkedListWithValues(1,4,7,8,9,13,14).head;
        SinglyLinkedListNode head2 = LinkedListCreationHelper.getLinkedListWithValues(2,5,10,15,16).head;
        SinglyLinkedListNode head3 = LinkedListCreationHelper.getLinkedListWithValues(3,6,11,12).head;
        SinglyLinkedListNode sortedListHead1 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head1, head2, head3));
        Assert.assertEquals(size(head1, head2, head3), size(sortedListHead1));
        Assert.assertTrue(isSorted(sortedListHead1));

        SinglyLinkedListNode head4 = LinkedListCreationHelper.getLinkedListWithValues(1,4,7,8,9,13,14).head;
        SinglyLinkedListNode head5 = LinkedListCreationHelper.getLinkedListWithValues(2).head;
        SinglyLinkedListNode sortedListHead2 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head4, head5));
        Assert.assertEquals(size(head4, head5), size(sortedListHead2));
        Assert.assertTrue(isSorted(sortedListHead2));

        SinglyLinkedListNode head6 = LinkedListCreationHelper.getLinkedListWithValues(3).head;
        SinglyLinkedListNode head7 = LinkedListCreationHelper.getLinkedListWithValues(1,4,7,8,9,13,14).head;
        SinglyLinkedListNode head8 = LinkedListCreationHelper.getLinkedListWithValues(2).head;
        SinglyLinkedListNode head9 = LinkedListCreationHelper.getLinkedListWithValues(3).head;
        SinglyLinkedListNode sortedListHead3 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head6, head7, head8, head9));
        Assert.assertEquals(size(head6, head7, head8, head9), size(sortedListHead3));
        Assert.assertTrue(isSorted(sortedListHead3));
    }

    @Test
    public void mergeSortedListWithEmptyListsReturnsEmptySortedList(){
        SinglyLinkedListNode head1 = LinkedListCreationHelper.getLinkedListWithValues().head;
        SinglyLinkedListNode head2 = LinkedListCreationHelper.getLinkedListWithValues().head;
        SinglyLinkedListNode head3 = LinkedListCreationHelper.getLinkedListWithValues().head;
        SinglyLinkedListNode sortedListHead1 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head1, head2, head3));
        Assert.assertEquals(size(head1, head2, head3), size(sortedListHead1));
        Assert.assertTrue(isSorted(sortedListHead1));
    }

    @Test
    public void mergeSortedListWithEqualSizeListsReturnsSortedList(){
        SinglyLinkedListNode head1 = LinkedListCreationHelper.getLinkedListWithValues(1,4,7).head;
        SinglyLinkedListNode head2 = LinkedListCreationHelper.getLinkedListWithValues(2,5,8).head;
        SinglyLinkedListNode head3 = LinkedListCreationHelper.getLinkedListWithValues(3,6,9).head;
        SinglyLinkedListNode sortedListHead1 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head1, head2, head3));
        Assert.assertEquals(size(head1, head2, head3), size(sortedListHead1));
        Assert.assertTrue(isSorted(sortedListHead1));

        SinglyLinkedListNode head4 = LinkedListCreationHelper.getLinkedListWithValues(1).head;
        SinglyLinkedListNode head5 = LinkedListCreationHelper.getLinkedListWithValues(2).head;
        SinglyLinkedListNode sortedListHead2 = mergeKSortedLinkedList.mergeSortedList(Arrays.asList(head4, head5));
        Assert.assertEquals(size(head4, head5), size(sortedListHead2));
        Assert.assertTrue(isSorted(sortedListHead2));

    }


}