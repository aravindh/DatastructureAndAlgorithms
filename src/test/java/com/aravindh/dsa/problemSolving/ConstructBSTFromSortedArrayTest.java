package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class ConstructBSTFromSortedArrayTest {

    @Test
    public void constructWithEmptyListReturnEmptyTree(){
        ConstructBSTFromSortedArray bst = new ConstructBSTFromSortedArray();
        bst.construct(Collections.EMPTY_LIST);
        Assert.assertTrue(bst.isEmpty());
    }

    @Test
    public void constructWithSingleNumberInListReturnNonEmptyTree(){
        ConstructBSTFromSortedArray bst = new ConstructBSTFromSortedArray();
        bst.construct(Arrays.asList(1));
        Assert.assertEquals("1,", bst.preOrder(true));
        Assert.assertEquals("1,", bst.postOrder(true));
        Assert.assertEquals("1,", bst.inOrder(true));
    }

    @Test
    public void constructWithEvenNumberOfElementsInListReturnValidBST(){
        ConstructBSTFromSortedArray bst = new ConstructBSTFromSortedArray();
        bst.construct(Arrays.asList(1,2,3,4));
        Assert.assertEquals("2,1,3,4,", bst.preOrder(true));
        Assert.assertEquals("1,4,3,2,", bst.postOrder(true));
        Assert.assertEquals("1,2,3,4,", bst.inOrder(true));
    }

    @Test
    public void constructWithOddNumberOfElementsInListReturnValidBST(){
        ConstructBSTFromSortedArray bst = new ConstructBSTFromSortedArray();
        bst.construct(Arrays.asList(1,2,3));
        Assert.assertEquals("2,1,3,", bst.preOrder(true));
        Assert.assertEquals("1,3,2,", bst.postOrder(true));
        Assert.assertEquals("1,2,3,", bst.inOrder(true));
    }

}