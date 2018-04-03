package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 17/3/18.
 */
@RunWith(value = JUnit4.class)
public class FindPivotInSortedRotatedArrayTest {

    FindPivotInSortedRotatedArray findPivotInSortedRotatedArray = new FindPivotInSortedRotatedArray();

    @Test
    public void getPivotOnEmptyListReturnsNull(){
        Assert.assertNull(findPivotInSortedRotatedArray.getPivot(Collections.EMPTY_LIST, true));
        Assert.assertNull(findPivotInSortedRotatedArray.getPivot(Collections.EMPTY_LIST, false));
    }

    @Test
    public void getPivotOnNonEmptySortedListReturnPivot(){
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4,5), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,1,1,2,3,4,5), true));

        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4,5), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,1,1,2,3,4,5), false));
    }

    @Test
    public void getPivotOnNonEmptySortedRotatedListReturnPivot(){
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(2,3,4,5,1), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,1,2,3,4,5,1), true));
        Assert.assertEquals(Integer.valueOf(0), findPivotInSortedRotatedArray.getPivot(Arrays.asList(5,5,5,0,1,2,4), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(3,4,5,1,2), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(4,5,1,2,3), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(5,1,2,3,4), true));

        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(2,3,4,1), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(3,4,1,2), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(4,1,2,3), true));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4), true));

        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(2,3,4,5,1), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,1,2,3,4,5,1), false));
        Assert.assertEquals(Integer.valueOf(0), findPivotInSortedRotatedArray.getPivot(Arrays.asList(5,5,5,0,1,2,4), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(3,4,5,1,2), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(4,5,1,2,3), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(5,1,2,3,4), false));

        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(2,3,4,1), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(3,4,1,2), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(4,1,2,3), false));
        Assert.assertEquals(Integer.valueOf(1), findPivotInSortedRotatedArray.getPivot(Arrays.asList(1,2,3,4), false));
    }
}