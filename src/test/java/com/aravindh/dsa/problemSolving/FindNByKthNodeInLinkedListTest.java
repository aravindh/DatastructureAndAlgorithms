package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class FindNByKthNodeInLinkedListTest {

    @Test
    public void getNByKthNodeWithEmptyListReturnsNull(){
        FindNByKthNodeInLinkedList linkedList = new FindNByKthNodeInLinkedList();
        Assert.assertNull(linkedList.getNByKthNode(1));
    }

    @Test
    public void getNByKthNodeWithNOddNonEmptyList(){
        FindNByKthNodeInLinkedList linkedList = new FindNByKthNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1,2,3,4,5);
        Assert.assertEquals("n=5 k=1 n/k=5/1 = 5", Integer.valueOf(5), linkedList.getNByKthNode(1));
        Assert.assertEquals("n=5 k=2 n/k=5/2 = 3",Integer.valueOf(2), linkedList.getNByKthNode(2));
        Assert.assertEquals("n=5 k=3 n/k=5/3 = 2",Integer.valueOf(1), linkedList.getNByKthNode(3));
        Assert.assertEquals("n=5 k=4 n/k=5/4 = 2",Integer.valueOf(1), linkedList.getNByKthNode(4));
        Assert.assertEquals("n=5 k=5 n/k=5/5 = 1",Integer.valueOf(1), linkedList.getNByKthNode(5));
    }

    @Test
    public void getNByKthNodeWithNEvenNonEmptyList(){
        FindNByKthNodeInLinkedList linkedList = new FindNByKthNodeInLinkedList();
        LinkedListCreationHelper.getLinkedListWithValues(linkedList, 1,2,3,4,5,6);
        Assert.assertEquals("n=6 k=1 n/k=6/1 = 6", Integer.valueOf(6), linkedList.getNByKthNode(1));
        Assert.assertEquals("n=6 k=2 n/k=6/2 = 3",Integer.valueOf(3), linkedList.getNByKthNode(2));
        Assert.assertEquals("n=6 k=3 n/k=6/3 = 2",Integer.valueOf(2), linkedList.getNByKthNode(3));
        Assert.assertEquals("n=6 k=4 n/k=6/4 = 1",Integer.valueOf(1), linkedList.getNByKthNode(4));
        Assert.assertEquals("n=6 k=5 n/k=6/5 = 1",Integer.valueOf(1), linkedList.getNByKthNode(5));
        Assert.assertEquals("n=6 k=5 n/k=6/6 = 1",Integer.valueOf(1), linkedList.getNByKthNode(6));
    }

}