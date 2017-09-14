package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class SegregateEvenOddNodeInLinkedListTest {

    @Test
    public void segregateWithAllOddNodesReturnsSameList(){
        SegregateEvenOddNodeInLinkedList linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1,3,5,7);
        linkedList.segregate();
        Assert.assertEquals("1, 3, 5, 7, ", linkedList.toString());
    }

    @Test
    public void segregateWithAllEvenNodesReturnsSameList(){
        SegregateEvenOddNodeInLinkedList linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 2,4,6,8);
        linkedList.segregate();
        Assert.assertEquals("2, 4, 6, 8, ", linkedList.toString());
    }

    @Test
    public void segregateWithOddAndEvenNodesReturnsSegregatedList(){
        SegregateEvenOddNodeInLinkedList linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1,2,3,4,5,7);
        linkedList.segregate();
        Assert.assertEquals("1, 3, 5, 7, 2, 4, ", linkedList.toString());

        linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1,2,3,5,7);
        linkedList.segregate();
        Assert.assertEquals("1, 3, 5, 7, 2, ", linkedList.toString());
    }

    @Test
    public void segregateWithEmptyListReturnsNull(){
        SegregateEvenOddNodeInLinkedList linkedList = new SegregateEvenOddNodeInLinkedList();
        linkedList.segregate();
        Assert.assertEquals("", linkedList.toString());
    }

    @Test
    public void segregateWithSingleElementReturnsUnModified(){
        SegregateEvenOddNodeInLinkedList linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1);
        linkedList.segregate();
        Assert.assertEquals("1, ", linkedList.toString());

        linkedList = new SegregateEvenOddNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 2);
        linkedList.segregate();
        Assert.assertEquals("2, ", linkedList.toString());
    }

}