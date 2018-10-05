package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class StrictlyIncreasingSubArrayTest {

    StrictlyIncreasingSubArray strictlyIncreasingSubArray = new StrictlyIncreasingSubArray();

    @Test
    public void getSubArrayCountWithEmptyListReturnsZero(){
        Assert.assertEquals(0, strictlyIncreasingSubArray.getSubArrayCount(Collections.EMPTY_LIST));
    }

    @Test
    public void getSubArrayCountWithSingleElementInListReturnsZero(){
        Assert.assertEquals(0, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(1)));
    }

    @Test
    public void getSubArrayCountWithAscendingOrderListReturnsCount(){
        Assert.assertEquals(10, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(1,2,3,4,5)));
        Assert.assertEquals(1, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(1,2)));
    }

    @Test
    public void getSubArrayCountWithDescendingOrderListReturnsZero(){
        Assert.assertEquals(0, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(5,4,3,2,1)));
        Assert.assertEquals(0, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(2,1)));
    }

    @Test
    public void getSubArrayCountWithUnOrderedListReturnsZero(){
        Assert.assertEquals(2, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(1,2,2,4)));
        Assert.assertEquals(20, strictlyIncreasingSubArray.getSubArrayCount(Arrays.asList(1,2,3,4,5,1,2,3,4,5)));
    }

}