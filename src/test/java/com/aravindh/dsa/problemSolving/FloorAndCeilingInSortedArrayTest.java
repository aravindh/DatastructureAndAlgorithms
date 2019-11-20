package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class FloorAndCeilingInSortedArrayTest {

    FloorAndCeilingInSortedArray floorAndCeilingInSortedArray = new FloorAndCeilingInSortedArray();

    @Test
    public void floorAndCeilOnEmptyListReturnsNull(){
        Assert.assertNull(floorAndCeilingInSortedArray.floor(Collections.EMPTY_LIST, 10));
        Assert.assertNull(floorAndCeilingInSortedArray.ceil(Collections.EMPTY_LIST, 10));
    }

    @Test
    public void floorAndCeilOnNonEmptyListInvalidTargetReturnsNull(){
        Assert.assertNull(floorAndCeilingInSortedArray.floor(Arrays.asList(1,2,3,4,5), 10));
        Assert.assertNull(floorAndCeilingInSortedArray.ceil(Arrays.asList(1,2,3,4,5), 10));

        Assert.assertNull(floorAndCeilingInSortedArray.floor(Arrays.asList(1,2,3,4,5), 0));
        Assert.assertNull(floorAndCeilingInSortedArray.ceil(Arrays.asList(1,2,3,4,5), 6));
    }

    @Test
    public void floorAndCeilOnNonEmptyListValidTargetReturnsNull(){
        Assert.assertEquals(Integer.valueOf(1), floorAndCeilingInSortedArray.floor(Arrays.asList(1,3,5,7,9), 2));
        Assert.assertNull(floorAndCeilingInSortedArray.ceil(Collections.EMPTY_LIST, 10));
    }

    @Test
    public void floorAndCeilOnEmptyListReturnsNull_X(){
        Assert.assertNull(floorAndCeilingInSortedArray.floor(Collections.EMPTY_LIST, 10));
        Assert.assertNull(floorAndCeilingInSortedArray.ceil(Collections.EMPTY_LIST, 10));
    }
}