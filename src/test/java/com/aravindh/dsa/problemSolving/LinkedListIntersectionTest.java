package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import com.aravindh.dsa.linear.LinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class LinkedListIntersectionTest {


    @Test
    public void getIntersectionNodeWithNoIntersectingNodesReturnsNull(){
        //UnEqual size
        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(3, 5, 1, 7, 9);
        LinkedListIntersection list1 = new LinkedListIntersection();
        LinkedListCreationHelper.getLinkedListWithValues(list1, 4,6,7,11);
        Assert.assertNull(list1.getIntersectionNode(list2));

        //Equal size
        list2.deleteNodeWithValue(3);
        Assert.assertNull(list1.getIntersectionNode(list2));
    }

    @Test
    public void getIntersectionNodeWithIntersectingNodesWithUnEqualSizeReturnsIntersectiongNode(){
        //l1.size  > l2.size
        LinkedList commonNodes = LinkedListCreationHelper.getLinkedListWithValues(7, 8, 9);
        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(4,5);
        LinkedListIntersection list1 = new LinkedListIntersection();
        LinkedListCreationHelper.getLinkedListWithValues(list1, 1,2,3);
        list1.appendAll(commonNodes);
        list2.appendAll(commonNodes);
        Assert.assertEquals(Integer.valueOf(7), list1.getIntersectionNode(list2));

        //l2.size > l1.size
        list1.deleteNodeWithValue(3);
        list2.prepend(3);
        Assert.assertEquals(Integer.valueOf(7), list1.getIntersectionNode(list2));

        list1.deleteNodeWithValue(1);
        list2.deleteNodeWithValue(3);
        list2.deleteNodeWithValue(4);
        list2.deleteNodeWithValue(5);
        Assert.assertEquals(Integer.valueOf(7), list1.getIntersectionNode(list2));

    }

    @Test
    public void getIntersectionNodeWithIntersectingNodesWithEqualSizeReturnsIntersectiongNode(){
        LinkedList commonNodes = LinkedListCreationHelper.getLinkedListWithValues(7, 8, 9);
        LinkedList list2 = LinkedListCreationHelper.getLinkedListWithValues(4,5,6);
        LinkedListIntersection list1 = new LinkedListIntersection();
        LinkedListCreationHelper.getLinkedListWithValues(list1, 1,2,3);
        list1.appendAll(commonNodes);
        list2.appendAll(commonNodes);
        Assert.assertEquals(Integer.valueOf(7), list1.getIntersectionNode(list2));
    }
}